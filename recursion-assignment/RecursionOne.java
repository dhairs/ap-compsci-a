// Dhairya Gupta   

import java.util.Scanner;

public class RecursionOne {
    public static void main(String[] args) {
        // Set up scanner for reading in
        Scanner input = new Scanner(System.in);
        // Read in as a string because it's easier to reverse a string than an integer
        String number;

        // Read in number as string
        System.out.print("Enter a number: ");
        number = input.nextLine();

        // Print the result of the reverse() method (which runs recursively)
        System.out.println(reverse(number));
    }

    // Method to reverse a string, takes String number as argument
    public static String reverse(String number) {

        // If the string is just 1 character long, return it (this will the base case,
        // but also preps us for a possible edge case)
        if (number.length() == 1)
            return number;

        // if not just one char long, we find the last character and add it to the rest
        // of the string using the reverse() method again, it eventually reaches a 1
        // length string and that ends up being the back of the returned string
        return number.charAt(number.length() - 1) + reverse(number.substring(0, number.length() - 1));
    }
}
