import java.util.Scanner;

public class ActualSwitchStatements {
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

        switch (userMonth) {
            // Switch that just checks what number user month is, if it's not 1, then
            // January, 2 february, etc.
            case 1:
                System.out.println("There were 31 days in that month.");
                break;
            case 2:
                // If the year is a leap year, add one day to February, otherwise just give the
                // amount of days in a normal february
                if (userYear % 4 == 0) {
                    System.out.println("There were 29 days in that month.");
                } else {
                    System.out.println("There were 28 days in that month");
                }
                break;

            case 3:
                System.out.println("There were 31 days in that month.");
                break;
            case 4:
                System.out.println("There were 30 days in that month.");
                break;
            case 5:
                System.out.println("There were 31 days in that month.");
                break;
            case 6:
                System.out.println("There were 30 days in that month.");
                break;
            case 7:
                System.out.println("There were 31 days in that month.");
                break;
            case 8:
                System.out.println("There were 31 days in that month.");
                break;
            case 9:
                System.out.println("There were 30 days in that month.");
                break;
            case 10:
                System.out.println("There were 31 days in that month.");
                break;
            case 11:
                System.out.println("There were 30 days in that month.");
                break;
            case 12:
                System.out.println("There were 30 days in that month.");
                break;
            default:
                // Default case; basically an else statement. If there's no case that matches
                // the user input, then it will run this.
                System.out.println("Invalid inputs.");
                break;
        }
        // Close input to prevent memory leaks
        input.close();

    }
}
