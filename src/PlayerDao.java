package com.IPLDao;

import com.DBConnection.IPLDBConnection;
import com.entity.Players;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerDao {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String query = "";
    List<Players> playersList = new ArrayList<>();

    public List<Players> getAllPlayers() {
        playersList= new ArrayList<>();
        try {
            con = IPLDBConnection.getIPLDBConnection();
            st = con.createStatement();
            query = "Select * From players";
            rs = st.executeQuery(query);
            while (rs.next()){
                Players players = new Players();
                players.setP_Id(rs.getInt(1));
                players.setP_Name(rs.getString(2));
                players.setTeam_name(rs.getString(3));
                players.setCategory(rs.getString(4));
                players.setScore(rs.getInt(5));
                players.setCatches(rs.getInt(6));
                players.setWickets(rs.getInt(7));
                playersList.add(players);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return playersList;
    }
}
