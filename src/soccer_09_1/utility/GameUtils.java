/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer_09_1.utility;

import java.util.Arrays;
import soccer_09_1.*;

/**
 *
 * @author ksomervi
 */
public class GameUtils {

    public static void addGameGoals(Game currGame) {
        
        //System.out.println(currGame.awayTeam + " : " + currGame.homeTeam);

        // Or possibly throw an Exception?
        if (currGame.getGoals() == null) {
            currGame.setGoals(new Goal[(int) (Math.random() * 10)]);   // If goals not initialized max will be 9
        }

        //System.out.println(currGame.goals.length);
        int i = 0;
        for (Goal currGoal : currGame.getGoals()) {
            currGoal = new Goal();
            currGoal.theTeam = Math.random() > 0.5 ? currGame.getHomeTeam() : currGame.getAwayTeam();
            currGoal.thePlayer = currGoal.theTeam.getPlayerArray()[(int) (Math.random() * currGoal.theTeam.getPlayerArray().length)];
            currGoal.theTime = (int) (Math.random() * 90);
            currGame.getGoals()[i] = currGoal;
            i++;
        }
        Arrays.sort(currGame.getGoals(), (g1, g2) -> Double.valueOf(g1.theTime).compareTo(Double.valueOf(g2.theTime)));

    }


}
