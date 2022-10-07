import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {

        // setup variables for the input of the user's numbers
        int numOne, numTwo, remainder = -1;
        Scanner input = new Scanner(System.in);

        // ask user for the numbers
        System.out.println("Enter the first number: ");
        numOne = input.nextInt();
        System.out.println("Enter the second number: ");
        numTwo = input.nextInt();

        // while the remainder isn't 0, run this loop
        while (remainder != 0) {
            // run the method to get the remainder of the two numbers
            remainder = remainder(numOne, numTwo);
            if (remainder != 0) {
                numOne = numTwo;
                numTwo = remainder;
            }
        }

        // print the GCD
        System.out.println("The greatest common denominator is " + numTwo);
    }

    // return the remainder between two numbers
    public static int remainder(int numOne, int numTwo) {
        return numOne % numTwo;
    }
}
