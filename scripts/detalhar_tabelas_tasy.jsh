import java.sql.*;
import java.util.*;

var url = System.getenv("TASY_URL");
var usuario = System.getenv("TASY_USUARIO");
var senha = System.getenv("TASY_SENHA");

var tabelas = List.of(
    "TASY.PESSOA_JURIDICA",
    "TASY.PESSOA_FISICA",
    "TASY.COM_LEADS",
    "TASY.COM_SOLIC_LEAD",
    "TASY.CML_PROSPECT",
    "TASY.CML_PROSPECT_PRODUTO",
    "TASY.COM_CLIENTE_PROPOSTA",
    "TASY.COM_CANAL_PROPOSTA",
    "TASY.COM_SOLIC_CONTRATO",
    "TASY.CONTRATO",
    "TASY.CONTRATO_DEPENDENTE",
    "TASY.BENEFICIARIO_CHEQUE"
);

Class.forName("oracle.jdbc.OracleDriver");
try (var conexao = DriverManager.getConnection(url, usuario, senha)) {
    System.out.println("CONECTADO");

    var sqlColunas = """
        select owner, table_name, column_id, column_name, data_type, data_length, nullable
        from all_tab_columns
        where owner = ?
          and table_name = ?
        order by column_id
        """;

    var sqlRelacionamentos = """
        select ac.constraint_name,
               ac.constraint_type,
               acc.column_name,
               ac_r.owner as owner_referenciado,
               ac_r.table_name as tabela_referenciada
          from all_constraints ac
          join all_cons_columns acc
            on acc.owner = ac.owner
           and acc.constraint_name = ac.constraint_name
          left join all_constraints ac_r
            on ac.r_owner = ac_r.owner
           and ac.r_constraint_name = ac_r.constraint_name
         where ac.owner = ?
           and ac.table_name = ?
           and ac.constraint_type in ('P','R')
         order by ac.constraint_type, ac.constraint_name, acc.position
        """;

    for (var chave : tabelas) {
        var partes = chave.split("\\.");
        var owner = partes[0];
        var table = partes[1];

        System.out.println("## " + chave);

        try (var stmt = conexao.prepareStatement(sqlColunas)) {
            stmt.setString(1, owner);
            stmt.setString(2, table);
            try (var rs = stmt.executeQuery()) {
                while (rs.next()) {
                    System.out.printf(
                        Locale.ROOT,
                        "%03d | %s | %s(%d) | nullable=%s%n",
                        rs.getInt("column_id"),
                        rs.getString("column_name"),
                        rs.getString("data_type"),
                        rs.getInt("data_length"),
                        rs.getString("nullable")
                    );
                }
            }
        }

        System.out.println("-- RELACIONAMENTOS");
        try (var stmt = conexao.prepareStatement(sqlRelacionamentos)) {
            stmt.setString(1, owner);
            stmt.setString(2, table);
            try (var rs = stmt.executeQuery()) {
                while (rs.next()) {
                    System.out.printf(
                        Locale.ROOT,
                        "%s | tipo=%s | coluna=%s | ref=%s.%s%n",
                        rs.getString("constraint_name"),
                        rs.getString("constraint_type"),
                        rs.getString("column_name"),
                        rs.getString("owner_referenciado"),
                        rs.getString("tabela_referenciada")
                    );
                }
            }
        }

        System.out.println();
    }
}
