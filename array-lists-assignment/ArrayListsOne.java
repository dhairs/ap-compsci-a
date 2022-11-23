
// import the classes
import java.util.*;

public class ArrayListsOne {
    public static void main(String[] args) {
        // set up the variables and array list to store numbers
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList values = new ArrayList<Integer>();
        // ask user to enter 10 numbers
        System.out.println("Enter up to 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers.add(input.nextInt());
        }
        // print out what the user entered and how many numbers they entered
        System.out.println(numbers.toString());
        System.out.println(numbers.size());

        // make a new array list to store the numbers excluding 2
        ArrayList<Integer> numbersWithout2 = new ArrayList<Integer>();
        // add every number but two to this array
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) != 2) {
                numbersWithout2.add(numbers.get(i));
            }
        }
        // print out the new arrayList
        System.out.println(numbersWithout2.toString());
        System.out.println("The size of the new array is " + numbersWithout2.size());

    }
}
