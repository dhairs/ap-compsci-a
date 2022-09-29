// Dhairya Gupta

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int userGuess, randomNumberGuesser, runningCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100 for the computer to guess!");
        userGuess = input.nextInt();

        do {
            runningCount++;
            randomNumberGuesser = (int) (Math.random() * 100) + 1;
            if (randomNumberGuesser > userGuess) {
                System.out.println("The computer guessed " + randomNumberGuesser + " which was too high!");
            } else if (randomNumberGuesser < userGuess) {
                System.out.println("The computer guessed " + randomNumberGuesser + " which was too low!");
            }
        } while (randomNumberGuesser != userGuess);

        System.out.println(
                "The system guessed your number (" + userGuess + ") correctly after " + runningCount + " tries!");
        input.close();
    }
}
