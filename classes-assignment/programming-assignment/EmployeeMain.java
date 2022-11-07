import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee1 = new Employee();
        int choice = 0;
        do {
            System.out.println(
                    "What do you want to do? (1 for a new employee, 2 for a raise, 3 for anniversary, 4 for bonus)?");
            choice = input.nextInt();
        } while (choice != 4);

    }
}
