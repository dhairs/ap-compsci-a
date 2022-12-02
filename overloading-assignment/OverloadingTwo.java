import java.util.Scanner;

public class OverloadingTwo {
    public static void main(String[] args) {
        // define an array of the user's input (way easier than having 3 seperate
        // variables)
        int[] userNumbers = new int[3];

        // just the index for the array
        int numbersInput = 0;

        // set up the other class so that we can use the isEqual method
        OverloadingTwoOperations operations = new OverloadingTwoOperations();

        // set up the scanner
        Scanner input = new Scanner(System.in);

        // while we haven't input three numbers, keep asking for input
        while (numbersInput < 3) {
            // ask the user to put in a number and set it equal to the variable 'number'
            System.out.print("Enter in a number (if done entering, type in -1): ");
            int number = input.nextInt();

            // if the input number is -1, break out of the loop so it doesnt run the rest of
            // it. It also prevents it from running again
            if (number == -1) {
                break;
            }

            // Add the number to the array at the index
            userNumbers[numbersInput] = number;

            // increment the index
            numbersInput++;
        }
        // if the user input three numbers
        if (numbersInput > 2) {
            // run the overloaded method with three parameters
            System.out.println(operations.isEqual(userNumbers[0], userNumbers[1], userNumbers[2]));
        } else {
            // otherwise, run the method with two parameters
            System.out.println(operations.isEqual(userNumbers[0], userNumbers[1]));
        }

    }

}