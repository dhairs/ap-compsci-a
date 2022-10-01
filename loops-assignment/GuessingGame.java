// Dhairya Gupta

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        // Define the input scanner and the input variables/the run count for how many
        // times the game has been played
        int userGuess, randomNumberGuesser, runningCount = 0;
        Scanner input = new Scanner(System.in);

        // Ask the user for an input for the computer to guess
        System.out.println("Enter a number between 1 and 100 for the computer to guess!");
        userGuess = input.nextInt();

        // Define a loop to keep guessing numbers until the correct number is guessed
        do {
            // update the amount of times the code has run
            runningCount++;

            // Generate a random number between 1 and 100 as a guess
            randomNumberGuesser = (int) (Math.random() * 100) + 1;

            // If greater than the actual guess, print that, otherwise print that it was
            // lower
            if (randomNumberGuesser > userGuess) {
                System.out.println("The computer guessed " + randomNumberGuesser + " which was too high!");
            } else if (randomNumberGuesser < userGuess) {
                System.out.println("The computer guessed " + randomNumberGuesser + " which was too low!");
            }
            // loop condition
        } while (randomNumberGuesser != userGuess);

        // print the results
        System.out.println(
                "The system guessed your number (" + userGuess + ") correctly after " + runningCount + " tries!");
        input.close();
    }
}
