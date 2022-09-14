
// Dhairya Gupta
import java.util.Scanner;

public class IfStatementsThree {
    public static void main(String[] args) {
        // Create scanner object for input
        Scanner input = new Scanner(System.in);

        // Create variable for the input of test score
        int studentGrade;

        // Ask the user for the test score
        System.out.print("Enter the test score: ");
        studentGrade = input.nextInt();

        // Compare the test score to these cases, and print out the grade
        if (studentGrade >= 90) {
            System.out.println("A");
        } else if (studentGrade >= 80) {
            System.out.println("B");
        } else if (studentGrade >= 70) {
            System.out.println("C");
        } else if (studentGrade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // Close the scanner object
        input.close();
    }
}
