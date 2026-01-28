package project_mvn_demo.IPL2026.DBConfiguration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

    public static void cleanup(Connection con, PreparedStatement st, ResultSet rs) {
        try {
            // 7.Release the Resources
            if (rs != null)
                rs.close();
            if (st != null)
                st.close();
            if (con != null)
                con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
