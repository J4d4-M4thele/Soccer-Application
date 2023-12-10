/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer_10_2;

import soccer_10_1.*;
import soccer_09_2.*;
import soccer_09_1.*;
import soccer_08_3.*;
import soccer_08_2.*;
import soccer_08_1.*;
import soccer_07_1.*;
import soccer_06_2.*;
import soccer_06_1.*;

/**
 *
 * @author Jada
 */
public class Team {

    private String teamName;
    private Player[] playerArray;
    private int pointsTotal;   
    private int goalsTotal;
    
    //9.2
    public Team(String teamName) {
        this.teamName = teamName;
    }
    //9.2
    public Team(String teamName, Player[] players) {
        this(teamName);
        this.playerArray = players;
    }
    //9.2
    public Team() {
    
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayerArray() {
        return playerArray;
    }

    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }

    public int getPointsTotal() {
        return pointsTotal;
    }

    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }
    
    public void incPointsTotal(int pointsTotal) {
    this.pointsTotal += pointsTotal;
    }

    public int getGoalsTotal() {
        return goalsTotal;
    }

    public void setGoalsTotal(int goalsTotal) {
        this.goalsTotal = goalsTotal;
    }
    
    public void incGoalsTotal(int goals) {
    this.goalsTotal = this.goalsTotal + goals;
    }
}
