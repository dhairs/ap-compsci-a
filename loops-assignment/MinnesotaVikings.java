// Dhairya Gupta

import java.util.ArrayList;
import java.util.Scanner;

public class MinnesotaVikings {
    public static void main(String[] args) {
        String[] wideReceivers = { "Adam Thielen", "Justin Jefferson", "Jalen Reagor", "Jalen Nailo", "K.J. Osborn" };
        int[] receptions = { 0, 0, 0, 0, 0 };

        Scanner input = new Scanner(System.in);

        int gamesPlayed, gamesIterable = 0;

        System.out.println("Enter the number of games played by the Minnesota Vikings: ");
        gamesPlayed = input.nextInt();

        while (gamesIterable < gamesPlayed) {
            String wideReceiver = "";
            int maxReceptions = 0;
            int receptionsForGame;
            for (int playerIterable = 0; playerIterable < wideReceivers.length; playerIterable++) {
                System.out.println("Enter the number of touchdowns for " + wideReceivers[playerIterable] + ": ");
                receptionsForGame = input.nextInt();
                receptions[playerIterable] += receptionsForGame;
                if (receptionsForGame > maxReceptions) {
                    maxReceptions = receptionsForGame;
                    wideReceiver = wideReceivers[playerIterable];
                }
            }
            System.out.println("The player with the most receptions for game " + (gamesIterable + 1) + " was "
                    + wideReceiver + " with " + maxReceptions + " receptions.");
            gamesIterable++;
        }

        System.out.println("The Minnesota Vikings have played " + gamesPlayed + " games.");

        int highestScore = 0;
        String highestScorer = "";
        for (int playerIterable = 0; playerIterable < wideReceivers.length; playerIterable++) {
            System.out.println(wideReceivers[playerIterable] + " has " + receptions[playerIterable]
                    + " touchdowns.");
            if (receptions[playerIterable] > highestScore) {
                highestScore = receptions[playerIterable];
                highestScorer = wideReceivers[playerIterable];
            }
        }
        System.out.println("The player with the highest scorer is " + highestScorer + " with " + highestScore
                + " receptions.");

    }
}