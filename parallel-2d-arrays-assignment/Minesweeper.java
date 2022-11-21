
//Aahan Sheth Block 1
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Minesweeper {

    public static void main(String[] args) {
        // set up reader
        Scanner reader = new Scanner(System.in);

        // not dead equals true
        boolean notdead = true;

        // generate a layout with bombs
        ArrayList<ArrayList<Integer>> layout = new ArrayList<>();

        // an empty layout without bombs
        ArrayList<ArrayList<Integer>> emptyLayout = new ArrayList<>();

        // a layout to see where the user has selected
        ArrayList<ArrayList<Integer>> userInputLayout = new ArrayList<>();

        // Random
        Random rand = new Random();

        // Generate the layout
        for (int row = 0; row < 5; row++) {
            // Add a new row to the generated layout
            layout.add(new ArrayList<Integer>());

            // Add a new row to the empty layout
            emptyLayout.add(new ArrayList<Integer>());

            // Add a new row to the user layout
            userInputLayout.add(new ArrayList<Integer>());

            for (int column = 0; column < 5; column++) {
                int numToAdd;
                // this to make sure there are more open spaces than bombs
                if (rand.nextInt(12) > 9) {
                    // 1 is a bomb
                    numToAdd = 1;
                } else {
                    // 0 is a free open space
                    numToAdd = 0;
                }
                // Add a new column to the layouts
                layout.get(row).add(numToAdd);
                userInputLayout.get(row).add(numToAdd);

                // Add a new column to the empty layout
                emptyLayout.get(row).add(0);
            }
        }

        do {
            // Print the empty layout
            showLayout(emptyLayout);

            // Get the user input for comlums and row
            System.out.print("Enter row (0-4): ");
            int row = reader.nextInt();
            System.out.print("Enter column (0-4): ");
            int column = reader.nextInt();

            // check if the user selected on a mine, if they did, say they dead
            if (layout.get(row).get(column) == 1) {
                System.out.println("you dead, the correct layout was:");
                showLayout(layout);
                notdead = false;
            } else {

                // if they didn't select a mine, say they are safe, and let them keep playing
                System.out.println("you safe");
                emptyLayout.get(row).set(column, 1);
                userInputLayout.get(row).set(column, 1);
            }
            if (checkIfFilled(userInputLayout)) {
                System.out.println("You won! 🎉");
                notdead = false;
            }

        } while (notdead);
    }

    public static boolean checkIfFilled(ArrayList<ArrayList<Integer>> layout) {
        // Iterate through every row
        for (int row = 0; row < layout.size(); row++) {
            // Iterate through every column
            for (int column = 0; column < layout.get(row).size(); column++) {
                // Print the value of the layout
                if (layout.get(row).get(column) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void showLayout(ArrayList<ArrayList<Integer>> layout) {
        // go through every row
        for (int row = 0; row < layout.size(); row++) {
            // go through every column
            for (int column = 0; column < layout.get(row).size(); column++) {
                // show the layout
                System.out.print(layout.get(row).get(column) + " ");
            }

            // Print a new line
            System.out.println();
        }
    }

}