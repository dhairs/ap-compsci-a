
// Dhairya Gupta
import java.util.Scanner;

public class ShadyRestRoom {
    public static void main(String[] args) {
        // Create scanner object for input
        Scanner input = new Scanner(System.in);

        // Create variables for the input of the user
        int roomChoice;
        int roomPrice = 0;
        int viewChoice;

        // This boolean is just to check if the program should continue if the user
        // enters an incorrect input or not
        Boolean endProgram = false;

        // Ask user what room choice they want
        System.out.print(
                "What room would you like? (Options are 1 for a queen bed, 2 for a king, or 3 for a king and a pullout couch): ");

        roomChoice = input.nextInt();

        // Check if input is valid, and then add that to the price of the room
        if (roomChoice == 1) {
            System.out.println("You chose the queen bed.");
            roomPrice = 125;
        } else if (roomChoice == 2) {
            System.out.println("You chose the king bed.");
            roomPrice = 139;
        } else if (roomChoice == 3) {
            System.out.println("You chose the king bed and pullout couch.");
            roomPrice = 165;
        } else {
            // If the input is incorrect, print out an error message and set the boolean to
            // true so the program terminates
            System.out.println("Invalid room choice");
            endProgram = true;
        }

        // Terminate program if the boolean is true
        if (endProgram)
            return;

        // Ask user what view they want
        System.out.print("Would you like a view? (Options are 1 for a lake view, or 2 for a park view): ");
        viewChoice = input.nextInt();

        // Check if input is valid, and then add that to the price of the room
        if (viewChoice == 1) {
            System.out.println("You chose the lake view");
            roomPrice += 20;
        } else if (viewChoice == 2) {
            System.out.println("You chose the park view");
        } else {
            // If incorrect input, add the default of lake view to the price
            System.out.println("Invalid view choice");
            roomPrice += 15;
        }

        // Output the final price for the user.
        System.out.println("The price of the room is $" + roomPrice);
        // Close the scanner object
        input.close();
    }
}
