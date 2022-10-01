// Dhairya Gupta

import java.util.Scanner;

public class NestedLoopsAssignmentOne {
    public static void main(String[] args) {

        // define variable for how many repetitions the user wants
        int repetitions;

        // Initialize scanner and ask user for reptitions
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of repetitions: ");
        repetitions = input.nextInt();

        // Run this loop for however many times the user requests
        for (int i = 0; i < repetitions; i++) {
            // print the start of the pattern
            System.out.print("*");

            // generate the middle of the pattern for however many times the user requests
            for (int j = 0; j < repetitions - 2; j++) {
                System.out.print("#");
            }

            // print the end of the pattern
            System.out.println("*");
        }

        // Close scanner to avoid memory leaks
        input.close();
    }
}