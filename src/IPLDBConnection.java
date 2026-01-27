package com.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class IPLDBConnection {
    public static Connection getIPLDBConnection() {
        Connection connection =null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ipl_2026?createDatabaseIfNotExist=true";
            String user = "root";
            String pass = "root";
            connection = DriverManager.getConnection(url,user,pass);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return connection;


    }
}
