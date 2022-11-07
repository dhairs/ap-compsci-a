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
}
