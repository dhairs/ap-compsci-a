// Dhairya Gupta

import java.util.Scanner;

public class RecursionTwo {
    public static void main(String[] args) {

        // Accept user input
        Scanner input = new Scanner(System.in);

        // Accepts integer values
        int num, pow;

        // Read in the numbers
        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.print("Enter a power: ");
        pow = input.nextInt();

        // Print the result of the power() method (which runs recursively)
        System.out.println(pow(num, pow));
    }

    // Define pow() method which takes an integer and the pow(er) it should be
    // raised to as arguments, integers
    public static int pow(int num, int pow) {
        // If the power is equal to 1, just return the number, this is our base case
        if (pow == 1)
            return num;
        // otherwise, return the number multiplied by the result of the pow() method
        // with 1 less power, this runs recursviely until the power equals 1 (note: it
        // does not work with negative numbers)
        return num * pow(num, pow - 1);
    }
}