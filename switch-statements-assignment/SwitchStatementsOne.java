
// Dhairya Gupta
import java.util.Scanner;

public class SwitchStatementsOne {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Create an array of all the days per month in a year
        final int[] monthDaysArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Define the variables for user input
        int userMonth, userYear;

        // Prompt the user to enter a month and year
        System.out.print("Enter a month (1-12): ");
        userMonth = input.nextInt();

        System.out.print("Enter a year: ");
        userYear = input.nextInt();

        // If the year is a leap year, add one day to February, otherwise just give the
        // data that is in the array
        if (userYear % 4 == 0 && userMonth == 2) {
            System.out.println("There were " + (monthDaysArray[userMonth - 1] + 1) + " days in that month.");
        } else {
            System.out.println("There were " + monthDaysArray[userMonth - 1] + " days in that month");
        }
    }
}