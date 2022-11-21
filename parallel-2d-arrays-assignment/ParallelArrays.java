import java.util.ArrayList;
import java.util.Scanner;

public class ParallelArrays {
    public static void main(String[] args) {
        // Define the variables
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        ArrayList<Integer> timesAdded = new ArrayList<Integer>();
        int numberOfNumbers;

        // Get the random numbers
        System.out.print("How many numbers would you like to generate? ");
        numberOfNumbers = input.nextInt();

        // Iterate through the amount of times we want to generate a random number
        for (int iterator = 0; iterator < numberOfNumbers; iterator++) {
            // Add a random number to the array
            randomNumbers.add(((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1));
        }

        // Iterate through every possible dice number
        for (int number = 1; number < 12; number++) {
            // Set the times added to 0
            int timesAddedToNumber = 0;

            // Iterate through the random numbers
            for (int iterator = 0; iterator < randomNumbers.size(); iterator++) {
                // Check if the number is equal to the random number
                if (randomNumbers.get(iterator) == number + 1) {
                    // Add 1 to the times added to number
                    timesAddedToNumber++;
                }
            }

            // Add the times added to number to the times added array
            timesAdded.add(timesAddedToNumber);
        }
        for (int item = 0; item < timesAdded.size(); item++) {
            System.out.println("The number " + (item + 1) + " was rolled " + timesAdded.get(item) + " times.");
        }

        input.close();
    }
}