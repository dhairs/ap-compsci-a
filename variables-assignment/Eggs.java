import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        int totalEggs;

        Scanner input = new Scanner(System.in);
        System.out.println("How many eggs would you like?");
        totalEggs = input.nextInt();
        int dozenEggs = totalEggs / 12;
        System.out.println("You ordered " + totalEggs + " eggs.");
        System.out.print("That's " + dozenEggs + " dozen at $3.25 per dozen and ");
        System.out.print(totalEggs % 12
                + " loose eggs at 45 cents each for a total of $");
        System.out.println(dozenEggs * 3.25 + (totalEggs % 12) * 0.45);
        input.close();
    }
}
