import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int numOne, numTwo, remainder = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        numOne = input.nextInt();
        System.out.println("Enter the second number: ");
        numTwo = input.nextInt();

        while (remainder != 0) {
            remainder = remainder(numOne, numTwo);
            if (remainder != 0) {
                numOne = numTwo;
                numTwo = remainder;
            }
        }

        System.out.println("The greatest common denominator is " + numTwo);
    }

    public static int remainder(int numOne, int numTwo) {
        return numOne % numTwo;
    }
}
