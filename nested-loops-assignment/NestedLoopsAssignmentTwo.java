// Dhairya Gupta

import java.util.Scanner;

public class NestedLoopsAssignmentTwo {
    public static void main(String[] args) {
        // define variable for how many repetitions the user wants
        int repetitions;

        // Initialize scanner and ask user for reptitions
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of repetitions: ");
        repetitions = input.nextInt();

        // Run this loop for however many times the user requests * 2 - 1 times so that
        // we get the pyramid shape, with the middle being the value the user entered
        for (int i = 0; i < repetitions * 2 - 1; i++) {

            // if the current iteration is greater than the user input, then we need to
            // start printing the bottom half of the pyramid
            if (i >= repetitions - 1) {

                // This loop prints the bottom of the pyramid, starting with letter J as the
                // iterator, it runs for the difference between repetions and the difference
                // between i and repetiitons
                for (int j = 1; j < repetitions - (i - repetitions) - 1; j++) {
                    System.out.print("?");
                }
            } else {

                // if we're still on the top half, just print the question marks i times
                for (int j = 0; j < i; j++) {
                    System.out.print("?");
                }
            }

            // place the final character
            System.out.println("#");
        }
        // avoid memory leaks
        input.close();
    }
}
