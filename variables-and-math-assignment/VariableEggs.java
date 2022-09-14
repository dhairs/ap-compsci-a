
// Dhairya Gupta
import java.util.Scanner;

public class VariableEggs {
    public static void main(String[] args) {
        // Define the eggs the user wants as an integer variable
        int totalEggs;

        // Create scanner object to read in user input
        Scanner input = new Scanner(System.in);

        // Ask how many eggs the user wants
        System.out.println("How many eggs would you like?");
        totalEggs = input.nextInt();

        // Calculate the number of dozens and the number of eggs left over
        int dozenEggs = totalEggs / 12;

        // Calculate the number of eggs left over and output pricing information
        System.out.println("You ordered " + totalEggs + " eggs.");
        System.out.print("That's " + dozenEggs + " dozen at $3.25 per dozen and ");
        System.out.print(totalEggs % 12
                + " loose eggs at 45 cents each for a total of $");
        System.out.println(dozenEggs * 3.25 + (totalEggs % 12) * 0.45);

        // Close input scanner
        input.close();
    }
}
