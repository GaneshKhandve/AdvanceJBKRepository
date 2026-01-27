package com.service;

import com.IPLDao.PlayerDao;
import com.entity.Players;

import java.util.*;

public class IPLService {
    PlayerDao playerDao = null;
    public IPLService(){
        playerDao = new PlayerDao();
    }
    public List<Players> getAllPlayers() {
        List<Players> playersList = playerDao.getAllPlayers();
        return playersList;
    }

    public List<Players> getallPlayersByCategory(String category) {
        List<Players> playersList = playerDao.getAllPlayers();
        List<Players> playersListBycategory = new ArrayList<>();
        for (Players players : playersList){
            if (players.getCategory().equalsIgnoreCase(category)){
                playersListBycategory.add(players);
            }
        }

        return playersListBycategory;

    }

    public List<Players> getPlyerDetailsById(int id) {
        List<Players> playersList = playerDao.getAllPlayers();
        List<Players> playersDetails = new ArrayList<>();
        for (Players player : playersList){
            if (player.getP_Id()==id){
                playersDetails.add(player);
            }
        }
        return playersDetails;
    }

    public List<Players> getAllPlayersByTeam(String teamName) {
        List<Players> playersList = playerDao.getAllPlayers();
        List<Players> byTeamName = new ArrayList<>();
        for (Players players : playersList){
            if (players.getTeam_name().equalsIgnoreCase(teamName)){
                byTeamName.add(players);
            }
        }
        return byTeamName;
    }

    public Optional<Players> getPlayerDetailMaxScore() {
        List<Players> playersList = playerDao.getAllPlayers();

        Optional<Players> byMaxScore = playersList.stream().
                max(Comparator.comparing(Players::getScore));
        return byMaxScore;


        }


    public Players getPlayerDetailMaxScore2() {
        List<Players> playersList = playerDao.getAllPlayers();
        if (playersList == null || playersList.isEmpty()){
            return  null;
        }

        Players max = playersList.get(0);

        for (Players p : playersList) {
            if (p.getScore() > max.getScore()) {
                max = p;
            }
        }

        return max;
    }

    public List<Players> getPlayersDetailMaxScore2() {
        List<Players> playersList = playerDao.getAllPlayers();
        List<Players> maxScorePlayers = new ArrayList<>();
        if (playersList == null || playersList.isEmpty()) {
            return maxScorePlayers; // empty list
        }

        // Step 1: Find max score
        int maxScore = playersList.get(0).getScore();

        for (Players p : playersList) {
            if (p.getScore() > maxScore) {
                maxScore = p.getScore();
            }
        }

        // Step 2: Collect all players with max score
        for (Players p : playersList) {
            if (p.getScore() == maxScore) {
                maxScorePlayers.add(p);
            }
        }

        return maxScorePlayers;
    }

    public List<Players> getPlayersByMaxWickets() {
        List<Players> playersList = playerDao.getAllPlayers();
        List<Players> maxWicketsPlayers = new ArrayList<>();
        if (playersList==null || playersList.isEmpty()){
            return null;
        }

        int maxWickets = playersList.get(0).getWickets();

        for (Players players : playersList){
            if (players.getWickets()> maxWickets){
                maxWickets= players.getWickets();
            }
        }

        for (Players players : playersList){
            if (players.getWickets()==maxWickets){
                maxWicketsPlayers.add(players);
            }
        }
      return maxWicketsPlayers;

    }

    public boolean updatePlayerScoreById(int pId, int score) {
        boolean update = playerDao.updatePlayerScoreById(pId,score);
        return update;
    }

    public boolean updatePlayerWicketsById(int pId2, int wickets) {
        boolean update = playerDao.updatePlayerWicketsById(pId2,wickets);
        return update;
    }

    public boolean deletePlayerById(int pId3) {
        boolean deleted = playerDao.deletePlayerById(pId3);
        return deleted;
    }
}
