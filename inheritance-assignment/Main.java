import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentExtension studentExtension = new StudentExtension();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student name, ID, age, and grade: ");
            studentExtension.enterData(input.next(), input.nextInt(), input.nextInt(), input.nextInt());

        }
        System.out.println("Search for an ID: ");
        studentExtension.findName(input.nextInt());

        System.out.println("Search for an age or grade: ");
        studentExtension.findAgeOrGrade(input.nextInt());
        input.close();
    }
}
