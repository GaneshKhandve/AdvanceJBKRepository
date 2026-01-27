package com.user;

import com.controller.IPLController;
import com.entity.Players;

import java.util.List;

public class IPL_App {
    public static void main(String[] args) {
        System.out.println("***Welcome to www.ipl.com ******");
        IPLController ic = new IPLController();
        System.out.println("All Player details");
        List<Players> allPlayers = ic.getAllPlayers();
        allPlayers.forEach(System.out::println);

        String  category =  "Bowler";
        //String category = "Batsman";
        System.out.println("Get Players By Category " +category );
        List<Players> playersListByCategory = ic.getPlayersByCategory(category);
        playersListByCategory.forEach(System.out::println);

        int id =1;

        System.out.println("Display Player Details Of id "+id );
        List<Players> player = ic.getPlayerDetailById(id);
        player.forEach(System.out::println);

        String team_name = "MI";
        System.out.println("Display All Players Details from Team Name" + team_name);
        List<Players> players = ic.getAllPlayersByTeam(team_name);
        players.forEach(System.out::println);

        System.out.println("Get Player Details having highest Score Using Stream Api ");
        Players players1= ic.getPlayerDetailMaxScore();
        System.out.println(players1);

        System.out.println("Get Player Details having highest Score Normal Way  ");
        Players players2= ic.getPlayerDetailMaxScore2();
        System.out.println(players1);

        System.out.println("Get Players Details having  Same highest Score Normal Way Using List ");
        List<Players> players3= ic.getPlayersDetailMaxScore2();
        players3.forEach(System.out::println);

        System.out.println("Get Players Details having  Same Wickets Score Normal Way Using List ");
        List<Players> playersList = ic.getPlayersByMaxWickets();
        playersList.forEach(System.out::println);

        int p_Id =2;
        int score = 750;
        System.out.println("Update the score of Player by Player Id " +p_Id);
        boolean update = ic.updatePlayerScoreById(p_Id,score);
        if (update){
            System.out.println("Player Score Updated Successfully  " + p_Id);
        }
        else {
            System.out.println("Player Score Not Updated Successfully" + p_Id);
        }


        int p_Id2 =15;
        int wickets = 29;
        System.out.println("Update the wickets  of Player by Player Id " +p_Id2);
        boolean update2 = ic.updatePlayerWicketsById(p_Id2,wickets);
        if (update2){
            System.out.println("Player Wickets Updated Successfully  " + p_Id2);
        }
        else {
            System.out.println("Player Wickets Not Updated Successfully Because Player Id not Present" + p_Id2);
        }

        int p_Id3 = 11;
        System.out.println("Delete Players Details by Player Id " + p_Id3);

        boolean delete = ic.deletePlayerById(p_Id3);
        if (delete){
            System.out.println("Player details deleted Successfully  " + p_Id3);
        }
        else {
            System.out.println("PPlayer details Not deleted Successfully Because Player Id not Present" + p_Id2);
        }


    }
}
