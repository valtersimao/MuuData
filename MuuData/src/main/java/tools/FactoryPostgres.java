package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryPostgres {

    private static Connection conexaoPG;

    public static Connection getConexaoPostgres() {
        if (conexaoPG == null) {
            try {
                conexaoPG = DriverManager.getConnection("jdbc:postgresql://200.18.128.54:5432/muudata", "muudata", "roca123"); //CONECTAR DE FORA DA ESCOLA
                //conexaoPG = DriverManager.getConnection("jdbc:postgresql://10.90.24.54:5432/muudata", "muudata", "roca123"); //CONECTAR DA ESCOLA
            } catch (SQLException ex) {
                System.err.println("Houve um erro na conexão!");
                return null;
            }
        }
        return conexaoPG;
    }
}
