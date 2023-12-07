/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer_06_2;

import soccer_06_1.*;

/**
 *
 * @author Jada
 */
public class League {
    public static void main(String[] args) {
        //*********************TEAM 1 (THE GREENS)*****************************
        //instantiating objects
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        
        //adding player info
        player1.playerName = "George Eliot";
        player2.playerName = "Graham Greene";
        player3.playerName = "Geoffrey Chaucer";
        
        //creating array of players(links to team object)
        Player[] thePlayers = {player1, player2, player3};
        
        //player1.playerName = "Robert Service";
        
        //instantiate a team
        Team team1 = new Team();
        
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
   
        //*********************TEAM 2 (THE REDS)*****************************
        Team team2 = new Team();
        team2.teamName = "The Reds";
        
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        //**********************************GAMES***************************
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;
        
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;
        
        Goal[] theGoals = {goal1}; 
        currGame.goals = theGoals;
        
        System.out.println("Goal scored after " +
                currGame.goals[0].theTime + " mins by " +
                currGame.goals[0].thePlayer.playerName + " of " + 
                currGame.goals[0].theTeam.teamName);
    }
}
