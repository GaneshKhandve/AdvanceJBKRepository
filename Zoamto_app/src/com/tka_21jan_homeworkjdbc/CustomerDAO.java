package com.tka_21jan_homeworkjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerDAO {
    public void saveCustomer(Customer c) throws Exception{
        Connection con = DBUtil.getConnection();
        String sql ="INSERT INTO customer VALUES (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,c.getId());
        ps.setString(2,c.getName());
        ps.setLong(3,c.getMob());
        ps.setString(4,c.getAddress());
        ps.executeUpdate();
        ps.close();
        con.close();
    }
}
