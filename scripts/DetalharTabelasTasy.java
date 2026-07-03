import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Locale;

public class DetalharTabelasTasy {
    public static void main(String[] args) throws Exception {
        String url = System.getenv("TASY_URL");
        String usuario = System.getenv("TASY_USUARIO");
        String senha = System.getenv("TASY_SENHA");

        List<String> tabelas = List.of(
            "TASY.PESSOA_JURIDICA",
            "TASY.PESSOA_FISICA",
            "TASY.COM_LEADS",
            "TASY.COM_SOLIC_LEAD",
            "TASY.COM_CLIENTE",
            "TASY.COM_CANAL",
            "TASY.CML_PROSPECT",
            "TASY.CML_PRODUTO",
            "TASY.CML_PROSPECT_PRODUTO",
            "TASY.COM_CLIENTE_PROPOSTA",
            "TASY.COM_CANAL_PROPOSTA",
            "TASY.COM_SOLIC_CONTRATO",
            "TASY.CONTRATO",
            "TASY.CONTRATO_DEPENDENTE",
            "TASY.BENEFICIARIO_CHEQUE"
        );

        String sqlColunas = """
            select owner, table_name, column_id, column_name, data_type, data_length, nullable
            from all_tab_columns
            where owner = ?
              and table_name = ?
            order by column_id
            """;

        String sqlRelacionamentos = """
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

        Class.forName("oracle.jdbc.OracleDriver");
        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
            System.out.println("CONECTADO");

            for (String chave : tabelas) {
                String[] partes = chave.split("\\.");
                String owner = partes[0];
                String table = partes[1];

                System.out.println("## " + chave);

                try (PreparedStatement stmt = conexao.prepareStatement(sqlColunas)) {
                    stmt.setString(1, owner);
                    stmt.setString(2, table);
                    try (ResultSet rs = stmt.executeQuery()) {
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
                try (PreparedStatement stmt = conexao.prepareStatement(sqlRelacionamentos)) {
                    stmt.setString(1, owner);
                    stmt.setString(2, table);
                    try (ResultSet rs = stmt.executeQuery()) {
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
    }
}
