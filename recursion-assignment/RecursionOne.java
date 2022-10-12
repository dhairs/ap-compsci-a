import java.util.Scanner;

public class RecursionOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number;
        System.out.print("Enter a number: ");
        number = input.nextLine();

        System.out.println(reverse(number));
    }

    public static String reverse(String number) {
        if (number.length() == 1)
            return number;
        return number.charAt(number.length() - 1) + reverse(number.substring(0, number.length() - 1));
    }
}
