
// Dhairya Gupta
import java.util.Scanner;

public class IfStatementsTwo {

    public static void main(String[] args) {
        // Create 3 variables for each of the three numbers
        int numOne, numTwo, numThree;

        // Create a scanner object with name 'input'
        Scanner input = new Scanner(System.in);

        // Ask the user for all three numbers
        System.out.print("Enter the first number: ");
        numOne = input.nextInt();
        System.out.print("Enter the second number: ");
        numTwo = input.nextInt();
        System.out.print("Enter the third number: ");
        numThree = input.nextInt();

        // Check if the numbers are all equal to eachother or not
        if (numThree == numOne && numThree == numTwo) {

            // If they are all equal, print out that they are all equal and give average
            System.out.println("All three numbers are equal, the average is " + numOne);
        } else if (numThree == numOne || numThree == numTwo) {

            // If two of the numbers are equal, print out that two of the numbers are equal
            System.out.println("Two of the numbers are equal");

            // Find the biggest number through a series of if-statements and print it out
            if (numThree > numOne && numThree > numTwo) {
                System.out.println("The largest number is " + numThree);
            } else if (numOne > numTwo) {
                System.out.println("The largest number is " + numOne);
            } else {
                System.out.println("The largest number is " + numTwo);
            }

            // Find the smallest number through a series of if-statements and print it out
            if (numThree < numOne && numThree < numTwo) {
                System.out.println("The smallest number is " + numThree);
            } else if (numOne < numTwo) {
                System.out.println("The smallest number is " + numOne);
            } else {
                System.out.println("The smallest number is " + numTwo);
            }

            // Calculate the average of the three numbers and print it out
            System.out.println("The Average is " + (numOne + numTwo + numThree) / 3);

        } else {

            // Do the same as above, but without the equal numbers
            System.out.println("None of the numbers are equal");
            if (numThree > numOne && numThree > numTwo) {
                System.out.println("The largest number is " + numThree);
            } else if (numOne > numTwo) {
                System.out.println("The largest number is " + numOne);
            } else {
                System.out.println("The largest number is " + numTwo);
            }
            if (numThree < numOne && numThree < numTwo) {
                System.out.println("The smallest number is " + numThree);
            } else if (numOne < numTwo) {
                System.out.println("The smallest number is " + numOne);
            } else {
                System.out.println("The smallest number is " + numTwo);
            }

            // Calculate and reveal the average to the user
            System.out.println("The Average is " + (double) (numOne + numTwo + numThree) / 3);
        }
    }
}
