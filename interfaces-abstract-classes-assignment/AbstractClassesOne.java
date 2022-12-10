import java.util.Scanner;

public class AbstractClassesOne extends IComboLock {
    public static void main(String[] args) {

        // setup the lock and lock it
        AbstractClassesOne lock = new AbstractClassesOne();
        lock.setcombo(1, 2, 3);
        lock.lock();

        Scanner input = new Scanner(System.in);

        // ask user for input and run the unlock method
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = input.nextInt();
        lock.unlock(num1, num2, num3);
    }

    // basically take in 3 numbers and set each part of the combo array equal to
    // them
    public void setcombo(int num1, int num2, int num3) {
        combo[0] = num1;
        combo[1] = num2;
        combo[2] = num3;
    }

    // check if the numbers entered match the combo array in the exact order
    public void unlock(int num1, int num2, int num3) {
        if (num1 == combo[0] && num2 == combo[1] && num3 == combo[2]) {
            locked = false;
            System.out.println("Unlocked Successfully!");
        }
        System.out.println("Incorrect Combination, try again.");
    }

}
