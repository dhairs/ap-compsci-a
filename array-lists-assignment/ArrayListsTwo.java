
// import the classes
import java.util.*;

public class ArrayListsTwo {
    public static void main(String[] args) {
        // set up the arraylist to store the user input numbers
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // just an array storing the possible ranges input by the user
        String[] ranges = { "1-10", "11-20", "21-30", "31-40", "41-50", "51-60", "61-70", "71-80", "81-90", "91-100" };

        // set up scanner
        Scanner input = new Scanner(System.in);

        // ask user how many numbers they want to enter
        System.out.println("How many numbers would you like to input?");
        int num = input.nextInt();
        System.out.println(
                "Please enter a list of numbers (between 1 and 100, numbers not in this range will be disregarded): ");

        // for the amount of numbers they want to enter, have the user enter numbers
        for (int i = 0; i < num; i++) {
            int number = input.nextInt();
            // add those numbers to the arrayList if they are between 1 and 100
            if (number >= 1 && number <= 100) {
                numbers.add(number);
            }
        }
        // print out the numbers that have been entered
        System.out.println("The numbers you entered are: " + numbers.toString());

        // create a new arraylist to store how many times each range of numbers appears
        ArrayList<Integer> numbersCount = new ArrayList<Integer>();

        // set it all to 0
        for (int i = 0; i < 10; i++) {
            numbersCount.add(0);
        }

        // for each number in the arraylist, add 1 to the corresponding range
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= 91) {
                numbersCount.set(9, numbersCount.get(9) + 1);
            } else if (numbers.get(i) >= 81) {
                numbersCount.set(8, numbersCount.get(8) + 1);
            } else if (numbers.get(i) >= 71) {
                numbersCount.set(7, numbersCount.get(7) + 1);
            } else if (numbers.get(i) >= 61) {
                numbersCount.set(6, numbersCount.get(6) + 1);
            } else if (numbers.get(i) >= 51) {
                numbersCount.set(5, numbersCount.get(5) + 1);
            } else if (numbers.get(i) >= 41) {
                numbersCount.set(4, numbersCount.get(4) + 1);
            } else if (numbers.get(i) >= 31) {
                numbersCount.set(3, numbersCount.get(3) + 1);
            } else if (numbers.get(i) >= 21) {
                numbersCount.set(2, numbersCount.get(2) + 1);
            } else if (numbers.get(i) >= 11) {
                numbersCount.set(1, numbersCount.get(1) + 1);
            } else if (numbers.get(i) >= 1) {
                numbersCount.set(0, numbersCount.get(0) + 1);
            }
        }
        // for each number in the ranges, print out how many times it appears
        for (int i = 0; i < numbersCount.size(); i++) {
            System.out.print(ranges[i] + " | ");
            for (int j = 0; j < numbersCount.get(i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
