// Dhairya Gupta

import java.util.ArrayList;
import java.util.Scanner;

public class MinnesotaVikings {
    public static void main(String[] args) {
        // Define an array of the players
        String[] wideReceivers = { "Adam Thielen", "Justin Jefferson", "Jalen Reagor", "Jalen Nailo", "K.J. Osborn" };

        // Define the receptions per player (by the same index as the first array)
        int[] receptions = { 0, 0, 0, 0, 0 };

        // Define the input scanner
        Scanner input = new Scanner(System.in);

        // Define the variables for the games played and an interable for the loop
        int gamesPlayed, gamesIterable = 0;

        // Ask the user for the amount of games played
        System.out.println("Enter the number of games played by the Minnesota Vikings: ");
        gamesPlayed = input.nextInt();

        // For every game played, run the loop
        while (gamesIterable < gamesPlayed) {
            // Define the variables for the player and the receptions that were the
            // strongest
            String wideReceiver = "";
            int maxReceptions = 0;
            int receptionsForGame;

            // For every player, ask for the receptions
            for (int playerIterable = 0; playerIterable < wideReceivers.length; playerIterable++) {
                System.out.println("Enter the number of touchdowns for " + wideReceivers[playerIterable] + ": ");
                receptionsForGame = input.nextInt();

                // If the receptions for the game are greater than the max receptions, update
                // the maxReceptions so we know who had the most points in a game
                receptions[playerIterable] += receptionsForGame;
                if (receptionsForGame > maxReceptions) {
                    maxReceptions = receptionsForGame;
                    wideReceiver = wideReceivers[playerIterable];
                }
            }
            // After iterating, print out who had the most points in each game
            System.out.println("The player with the most receptions for game " + (gamesIterable + 1) + " was "
                    + wideReceiver + " with " + maxReceptions + " receptions.");
            gamesIterable++;
        }

        // Print out the total games played
        System.out.println("The Minnesota Vikings have played " + gamesPlayed + " games.");

        // Define a variable for the player with highest score
        int highestScore = 0;
        String highestScorer = "";

        // for every player, check if the receptions are greater than the highest score
        for (int playerIterable = 0; playerIterable < wideReceivers.length; playerIterable++) {
            System.out.println(wideReceivers[playerIterable] + " has " + receptions[playerIterable]
                    + " touchdowns.");

            // If the receptions are greater than the highest score, update the highest
            // score and the name of the player
            if (receptions[playerIterable] > highestScore) {
                highestScore = receptions[playerIterable];
                highestScorer = wideReceivers[playerIterable];
            }
        }

        // print out the final results
        System.out.println("The player with the highest scorer is " + highestScorer + " with " + highestScore
                + " receptions.");

    }
}