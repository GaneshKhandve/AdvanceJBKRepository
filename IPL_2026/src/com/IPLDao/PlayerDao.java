package com.IPLDao;

import com.DBConnection.IPLDBConfigConnection;
import com.entity.Players;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerDao {
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    String query = "";
    List<Players> playersList = new ArrayList<>();

    public List<Players> getAllPlayers() {
        playersList= new ArrayList<>();
        try {
            con = IPLDBConfigConnection.getIPLDBConnection();
            query = "Select * From players";
            st = con.prepareStatement(query);

            rs = st.executeQuery();
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

    public boolean updatePlayerScoreById(int pId, int score) {
        try {
            con = IPLDBConfigConnection.getIPLDBConnection();
            query = "update players set score =? where p_id= ? ";
            st = con.prepareStatement(query);
            st.setInt(1,score);
            st.setInt(2,pId);

            int ack  = st.executeUpdate();
            if (ack > 0){
                return true;

            }

            }
        catch (Exception e) {
            throw new RuntimeException(e);
        }


        return false;


    }

    public boolean updatePlayerWicketsById(int pId2, int wickets) {

        try {
            con = IPLDBConfigConnection.getIPLDBConnection();
            query = "update players set wickets =? where p_id= ? ";
            st = con.prepareStatement(query);
            st.setInt(1,wickets);
            st.setInt(2,pId2);

            int ack  = st.executeUpdate();
            if (ack > 0){
                return true;
            }

        }
        catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }


        return false;
    }

    public boolean deletePlayerById(int pId3) {
        try {
            con = IPLDBConfigConnection.getIPLDBConnection();
            query = "Delete From players where p_id= ? ";
            st = con.prepareStatement(query);
            st.setInt(1,pId3);
            int ack  = st.executeUpdate();
            if (ack > 0){
                return true;
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }


        return false;


    }



}
