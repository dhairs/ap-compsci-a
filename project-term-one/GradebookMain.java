import java.util.Scanner;

public class GradebookMain {
    public static void main(String[] args) {
        String[] options = { "1: Add Classes", "2: Add Attendance", "3: Add Grades", "4: View Classes",
                "5: View Attendance", "6: View Grades", "9: Exit" };

        Gradebook gradebook = new Gradebook(5);

        // create a new scanner object
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int student = 0;
        while (input != 9) {
            System.out.println("Please select an option: ");
            for (int iterator = 0; iterator < options.length; iterator++) {
                System.out.println(options[iterator]);
            }
            input = scanner.nextInt();
            if (input == 9)
                break;
            System.out
                    .println("Please enter the student number. Between 0 and " + (gradebook.studentClasses.size() - 1));
            student = scanner.nextInt();

            while (student > gradebook.studentClasses.size() - 1 || student < 0) {
                System.out.println("Please enter a valid student number.");
                student = scanner.nextInt();
            }
            switch (input) {
                case 1:
                    gradebook.addClasses(student);
                    break;
                case 2:
                    gradebook.addAttendance(student);
                    break;
                case 3:
                    gradebook.addGrade(student);
                    break;
                case 4:
                    gradebook.displayClasses(student);
                    break;
                case 5:
                    gradebook.displayAttendance(student);
                    break;
                case 6:
                    gradebook.displayGrades(student);
                    break;

                default:
                    System.out.println("Not a valid option.");

            }

        }
        System.out.println("Thank you for using the CATD High School Gradebook!");
    }
}
