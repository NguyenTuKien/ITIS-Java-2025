package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String DB_URL = System.getenv("DB_URL") != null
            ? System.getenv("DB_URL")
            : "jdbc:mysql://localhost:3306/Practice03";

    private static final String DB_USER = System.getenv("DB_USER") != null
            ? System.getenv("DB_USER")
            : "admin";

    private static final String DB_PASSWORD = System.getenv("DB_PASSWORD") != null
            ? System.getenv("DB_PASSWORD")
            : "TestAcc@1234";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("MySQL JDBC Driver not found", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        // In ra để kiểm tra xem nó đang dùng URL nào (Debug)
        System.out.println("Connecting to: " + DB_URL + " with user: " + DB_USER);
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}