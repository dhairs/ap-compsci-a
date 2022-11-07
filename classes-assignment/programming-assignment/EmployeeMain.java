import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee1 = new Employee();
        int choice = 0;
        do {
            System.out.println(
                    "What do you want to do? (1 for a new employee, 2 for a raise, 3 for anniversary, 4 for bonus, 5 for exit)?");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    employee1.newEmployee();
                    break;
                case 2:
                    System.out.println("What is the raise percentage?");
                    int raisePercent = input.nextInt();
                    employee1.raise(raisePercent);
                    break;
                case 3:
                    employee1.anniversary();
                    break;
                case 4:
                    employee1.bonus();
                    break;

            }
        } while (choice != 5);

    }
}
