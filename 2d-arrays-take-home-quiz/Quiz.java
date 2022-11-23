
// import the scanner
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        // set up scanner
        Scanner input = new Scanner(System.in);

        // create a new 2DArray of gymnasts that has an innner array of size 5 (to store
        // all the scores)
        double[][] gymnasts = new double[20][5];

        // ask the user how many gymnasts they actually want to input, with a maximum of
        // 20
        System.out.println("How many gymnasts? (max of 20)");
        int numGymnasts = input.nextInt();

        // variable that tracks what the largest number for the total is.
        double largest = 0;

        // this loop runs for however many gymnasts the user wants to input and asks for
        // every score
        for (int i = 0; i < numGymnasts; i++) {

            // ask for the scores for each gymnast on each line
            System.out.println("Please enter the vault, bars, beam, and floor (separated by line)");
            double vault, bars, beam, floor;
            vault = input.nextDouble();
            bars = input.nextDouble();
            beam = input.nextDouble();
            floor = input.nextDouble();

            // add those scores to the 2d array at the current gymnast's index for each part
            gymnasts[i][0] = vault;
            gymnasts[i][1] = bars;
            gymnasts[i][2] = beam;
            gymnasts[i][3] = floor;

            // get the total for this gymnast
            double total = floor + beam + bars + vault;

            // add the total to the array too
            gymnasts[i][4] = total;

            // if the total is greater than the largest, set the largest to the total
            if (largest < total) {
                largest = total;
            }

        }
        // run the display method to show the results
        display(gymnasts, largest, numGymnasts);

        // close the scanner so no memory leaks
        input.close();
    }

    // define a new method that takes in the 2d array, the largest total, and the
    // number of gymnasts
    public static void display(double[][] gymnasts, double total, int numGymnasts) {
        // print that the results are:
        System.out.println("The results are:");

        // loop through the the gymnasts for the amount of gymnasts that were input
        for (int i = 0; i < numGymnasts; i++) {
            // print the scores for the gymnast, separated by spaces.
            System.out.println(gymnasts[i][0] + " " + gymnasts[i][1] + " " + gymnasts[i][2] + " " + gymnasts[i][3] + " "
                    + gymnasts[i][4]);

        }

        // print out the largest total
        System.out.println("The winning total is " + total);
    }
}