//Aluna: Laysa Bernardes Campos da Rocha - CB3024873 
//Aluno: Lucas Lopes Cruz - CB3025284 

import java.sql.*;

public class Database {
    private static final String CONNECTION_STRING = 
            "jdbc:sqlserver://DESKTOP-S2I6ET8;Database=AcademiaDB;IntegratedSecurity=true;encrypt=true;trustServerCertificate=true";

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONNECTION_STRING);
    }

    public static void main(String[] args) {
        try (Connection con = getConnection()) {
            System.out.println("Conexão OK");
        } catch (SQLException ex) {
            System.out.println("Erro na conexão com o banco de dados");
            ex.printStackTrace();
        }
    }
}