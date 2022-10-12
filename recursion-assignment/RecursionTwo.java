import java.util.Scanner;

public class RecursionTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, pow;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.print("Enter a power: ");
        pow = input.nextInt();
        System.out.println(pow(num, pow));
    }

    public static int pow(int num, int pow) {
        if (pow == 1)
            return num;
        return num * pow(num, pow - 1);
    }
}