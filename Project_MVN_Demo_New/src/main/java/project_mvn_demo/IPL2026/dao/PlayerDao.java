package project_mvn_demo.IPL2026.dao;

import project_mvn_demo.IPL2026.DBConfiguration.IPLDBConnection;
import project_mvn_demo.IPL2026.entity.Players;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            con = IPLDBConnection.getIPLDBConnection();
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
        finally {
            IPLDBConnection.cleanup(con,st,rs);
        }
        return playersList;
    }

    public boolean updatePlayerScoreById(int pId, int score) {
        try {
            con = IPLDBConnection.getIPLDBConnection();
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
        finally {
            IPLDBConnection.cleanup(con,st,rs);
        }


        return false;


    }

    public boolean updatePlayerWicketsById(int pId2, int wickets) {

        try {
            con = IPLDBConnection.getIPLDBConnection();
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
        finally {
            IPLDBConnection.cleanup(con,st,rs);
        }


        return false;
    }

    public boolean deletePlayerById(int pId3) {
        try {
            con = IPLDBConnection.getIPLDBConnection();
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
        finally {
            IPLDBConnection.cleanup(con,st,rs);
        }


        return false;


    }
}
