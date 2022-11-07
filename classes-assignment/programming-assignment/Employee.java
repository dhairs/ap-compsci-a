import java.util.Scanner;

public class Employee {
    public Scanner input = new Scanner(System.in);
    private int employeeID;
    private int salary;
    private int yearsEmployed;

    public Employee() {
        employeeID = 0;
        salary = 0;
        yearsEmployed = 0;
    }

    public void newEmployee() {
        System.out.print("Enter employee ID: ");
        employeeID = input.nextInt();
        System.out.print("Enter salary: ");
        salary = input.nextInt();
        System.out.print("Enter years employed: ");
        yearsEmployed = input.nextInt();
    }

    public void anniversary() {
        yearsEmployed += 1;
    }

    public void raise(int percent) {
        salary += salary * percent / 100;
    }

    public void bonus() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
        System.out.println("Years employed: " + yearsEmployed);
        if (yearsEmployed > 10) {
            System.out.println("Bonus: " + salary * 0.1);
        } else {
            System.out.println("Bonus: " + salary * 0.05);
        }
    }
}
