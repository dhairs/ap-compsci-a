// Dhairya Gupta

import java.util.Scanner;

public class LoopsAssignmentOne {
    public static void main(String[] args) {
        int repetitions;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of repetitions: ");
        repetitions = input.nextInt();

        for (int i = 0; i < repetitions; i++) {
            System.out.print("*");
            for (int j = 0; j < repetitions - 2; j++) {
                System.out.print("#");
            }
            System.out.println("*");
        }

    }
}