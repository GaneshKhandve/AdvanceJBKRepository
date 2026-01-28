package project_mvn_demo.IPL2026.controller;

import project_mvn_demo.IPL2026.service.IPLService;
import project_mvn_demo.IPL2026.entity.Players;

import java.util.List;
import java.util.Optional;

public class IPLController {
    IPLService service = null;
    public IPLController(){
        service = new IPLService();
    }
    public List<Players> getAllPlayers() {
        List<Players> playersList = service.getAllPlayers();
        return playersList;
    }

    public List<Players> getPlayersByCategory(String category) {
        List<Players> playersListByCategory = service.getallPlayersByCategory(category);
        return playersListByCategory;
    }

    public List<Players> getPlayerDetailById(int id) {
        List<Players> players = service.getPlyerDetailsById(id);
        return players;
    }

    public List<Players> getAllPlayersByTeam(String teamName) {
        List<Players> playersByTeamName = service.getAllPlayersByTeam(teamName);
        return playersByTeamName;
    }

    public Players getPlayerDetailMaxScore() {
        Optional<Players> playerMaxScoreDetails = service.getPlayerDetailMaxScore();
        return playerMaxScoreDetails.orElse(null);
    }

    public Players getPlayerDetailMaxScore2() {
        Players players = service.getPlayerDetailMaxScore2();
        return players;
    }


    public List<Players> getPlayersDetailMaxScore2() {
        List<Players> getplayerdetailByMaxScore = service.getPlayersDetailMaxScore2();
        return getplayerdetailByMaxScore;
    }

    public List<Players> getPlayersByMaxWickets() {
        List<Players> playersListByMaxWickets = service.getPlayersByMaxWickets();
        return playersListByMaxWickets;
    }

    public boolean updatePlayerScoreById(int pId, int score) {
        boolean update = service.updatePlayerScoreById(pId,score);
        return update;
    }

    public boolean updatePlayerWicketsById(int pId2, int wickets) {
        boolean update = service.updatePlayerWicketsById(pId2,wickets);
        return update;
    }

    public boolean deletePlayerById(int pId3) {
        boolean delete = service.deletePlayerById(pId3);
        return delete;
    }
}
