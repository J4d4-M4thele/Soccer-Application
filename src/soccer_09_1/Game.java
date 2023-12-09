/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer_09_1;

import soccer_08_3.*;
import soccer_08_2.*;
import soccer_08_1.*;
import soccer_07_1.*;
import soccer_06_2.*;
import soccer_06_1.*;
import soccer_09_1.utility.GameUtils;

/**
 *
 * @author Jada
 */
public class Game {

    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;

    public void playGame(int maxGoals) {

        //onlt 1 - 6 goals can be scored
        int numOfGoals = (int) (Math.random() * (maxGoals + 1));
        Goal[] theGoals = new Goal[numOfGoals];
        this.setGoals(theGoals);
        GameUtils.addGameGoals(this);
    }

    public void playGame() {
        playGame(6);
    }

    public String getDescription() {
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal : this.getGoals()) {
            returnString.append("Goal scored after " + currGoal.theTime + " mins by "
                    + currGoal.thePlayer.getPlayerName() + " of " + currGoal.theTeam.getTeamName() + "\n");

        }
        return returnString.toString();
    }

    /**
     * @return the homeTeam
     */
    public Team getHomeTeam() {
        return homeTeam;
    }

    /**
     * @param homeTeam the homeTeam to set
     */
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    /**
     * @return the awayTeam
     */
    public Team getAwayTeam() {
        return awayTeam;
    }

    /**
     * @param awayTeam the awayTeam to set
     */
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    /**
     * @return the goals
     */
    public Goal[] getGoals() {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }
}
