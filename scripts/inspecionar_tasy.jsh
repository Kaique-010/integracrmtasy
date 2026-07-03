import java.sql.*;
import java.util.*;

var url = System.getenv("TASY_URL");
var usuario = System.getenv("TASY_USUARIO");
var senha = System.getenv("TASY_SENHA");

var termos = List.of(
    "PESSOA",
    "JURIDICA",
    "LEAD",
    "PROSPECT",
    "PROPOSTA",
    "ADESAO",
    "BENEFICI",
    "CONTRAT",
    "PORTABIL",
    "SOLICIT",
    "COMERCIAL",
    "PRODUTO"
);

Class.forName("oracle.jdbc.OracleDriver");
try (var conexao = DriverManager.getConnection(url, usuario, senha)) {
    System.out.println("CONECTADO");

    var sqlTabelas = """
        select owner, table_name
        from all_tables
        where owner not in ('SYS', 'SYSTEM')
          and (
            upper(table_name) like '%PESSOA%' or
            upper(table_name) like '%JURIDICA%' or
            upper(table_name) like '%LEAD%' or
            upper(table_name) like '%PROSPECT%' or
            upper(table_name) like '%PROPOSTA%' or
            upper(table_name) like '%ADESAO%' or
            upper(table_name) like '%BENEFICI%' or
            upper(table_name) like '%CONTRAT%' or
            upper(table_name) like '%PORTABIL%' or
            upper(table_name) like '%SOLICIT%' or
            upper(table_name) like '%COMERCIAL%' or
            upper(table_name) like '%PRODUTO%'
          )
        order by owner, table_name
        fetch first 120 rows only
        """;

    var tabelas = new ArrayList<String>();
    try (var stmt = conexao.prepareStatement(sqlTabelas);
         var rs = stmt.executeQuery()) {
        System.out.println("### TABELAS");
        while (rs.next()) {
            var owner = rs.getString("owner");
            var table = rs.getString("table_name");
            var chave = owner + "." + table;
            tabelas.add(chave);
            System.out.println(chave);
        }
    }

    var sqlColunas = """
        select owner, table_name, column_id, column_name, data_type, data_length, nullable
        from all_tab_columns
        where owner = ?
          and table_name = ?
        order by column_id
        """;

    System.out.println();
    System.out.println("### COLUNAS");
    for (var chave : tabelas.stream().limit(20).toList()) {
        var partes = chave.split("\\.");
        try (var stmt = conexao.prepareStatement(sqlColunas)) {
            stmt.setString(1, partes[0]);
            stmt.setString(2, partes[1]);
            try (var rs = stmt.executeQuery()) {
                System.out.println("## " + chave);
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
                System.out.println();
            }
        }
    }
}
