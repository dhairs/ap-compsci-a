import java.util.ArrayList;
import java.util.Scanner;

// Minesweeper
public class TwoDimensionalArrays {
    public static void main(String[] args) {
        // Define the variables
        Scanner input = new Scanner(System.in);

        // A variable so we can do some while loop magic
        boolean alive = true;

        // Generated grid has the mines
        ArrayList<ArrayList<Integer>> generatedGrid = new ArrayList<>();

        // Empty grid is just an empty grid that marks where the user has clicked
        ArrayList<ArrayList<Integer>> emptyGrid = new ArrayList<>();

        // User grid is the grid that tracks if the user has selected all the open
        // spaces
        ArrayList<ArrayList<Integer>> userGrid = new ArrayList<>();

        int gridSize = 10;
        // Generate the grid
        for (int row = 0; row < gridSize; row++) {
            // Add a new row to the generated grid
            generatedGrid.add(new ArrayList<Integer>());

            // Add a new row to the empty grid
            emptyGrid.add(new ArrayList<Integer>());

            // Add a new row to the user grid
            userGrid.add(new ArrayList<Integer>());

            for (int column = 0; column < gridSize; column++) {

                int numToAdd = ((int) (Math.random() * 10) > 7 ? 1 : 0);
                // Add a new column to the generated grid
                generatedGrid.get(row).add(numToAdd);
                userGrid.get(row).add(numToAdd);

                // Add a new column to the empty grid
                emptyGrid.get(row).add(0);
            }
        }

        while (alive) {
            // Print the empty grid
            displayGrid(emptyGrid);

            // Get the user input (column and row)
            System.out.print("Enter a column: ");
            int userColumn = input.nextInt();
            System.out.print("Enter a row: ");
            int userRow = input.nextInt();

            // check if the user clicked on a mine, if they did, end the game
            if (generatedGrid.get(userRow).get(userColumn) == 1) {
                System.out.println("Oops! You clicked on a mine, game over! 💀");
                alive = false;
            } else {
                // if they didn't click on a mine, update the empty grid to show that they
                // picked a new spot
                System.out.println("You clicked a safe spot! Nice job. 👻");
                emptyGrid.get(userRow).set(userColumn, 1);
                userGrid.get(userRow).set(userColumn, 1);
            }
            if (checkIfFilled(userGrid)) {
                System.out.println("You won! 🎉");
                alive = false;
            }

        }

        input.close();
    }

    public static void displayGrid(ArrayList<ArrayList<Integer>> grid) {
        // Iterate through every row
        for (int row = 0; row < grid.size(); row++) {
            // Iterate through every column
            for (int column = 0; column < grid.get(row).size(); column++) {
                // Print the value of the grid
                System.out.print(grid.get(row).get(column) + " ");
            }

            // Print a new line
            System.out.println();
        }
    }

    public static boolean checkIfFilled(ArrayList<ArrayList<Integer>> grid) {
        // Iterate through every row
        for (int row = 0; row < grid.size(); row++) {
            // Iterate through every column
            for (int column = 0; column < grid.get(row).size(); column++) {
                // Print the value of the grid
                if (grid.get(row).get(column) == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}