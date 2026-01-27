package com.tka_21jan_homeworkjdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getConnection () throws Exception{
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/batch1297_db",
                "root",
                "root"
        );
    }
}
