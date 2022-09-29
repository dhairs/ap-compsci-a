// Dhairya Gupta

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, numberOne, numberTwo;
        System.out.println("Enter the first number (lower bound): ");
        numberOne = input.nextInt();
        System.out.println("Enter the second number (upper bound): ");
        numberTwo = input.nextInt();
        for (int i = numberOne; i <= numberTwo; i++) {
            sum += i;
        }
        System.out.println(sum);
        input.close();
    }

    public static void challengeOne() {
        Scanner input = new Scanner(System.in);
        int sum = 0, numberOne, numberTwo;
        boolean odd;
        System.out.println("Enter the first number (lower bound): ");
        numberOne = input.nextInt();
        System.out.println("Enter the second number (upper bound): ");
        numberTwo = input.nextInt();

        System.out.println("Add odd or even numbers? (true for odd/false for even): ");
        odd = input.nextBoolean();

        for (int i = numberOne; i <= numberTwo; i++) {
            if (odd) {
                if (i % 2 != 0) {
                    sum += i;
                }
            } else {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
        input.close();
    }

    public static void challengeTwo() {
        Scanner input = new Scanner(System.in);
        int sum = 0, numberOne, numberTwo, numberThree;
        System.out.println("Enter the first number (lower bound): ");
        numberOne = input.nextInt();
        System.out.println("Enter the second number (upper bound): ");
        numberTwo = input.nextInt();
        System.out.println("Enter the third number (divisor): ");
        numberThree = input.nextInt();

        for (int i = numberOne; i <= numberTwo; i++) {
            if (i % numberThree == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        input.close();
    }
}
