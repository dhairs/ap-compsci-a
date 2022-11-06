import java.util.Scanner;

public class GradebookMain {
    public static void main(String[] args) {

        // create array of options the user can choose, just makes it easier to print
        // everything
        String[] options = { "1: Add Classes", "2: Add Attendance", "3: Add Grades", "4: View Classes",
                "5: View Attendance", "6: View Grades", "9: Exit" };

        // instantiate a new Gradebook object
        Gradebook gradebook = new Gradebook(5);

        // create a new scanner object
        Scanner scanner = new Scanner(System.in);

        // initalize 2 new variables that will be used in the while loop, default to 0
        int input = 0;
        int student = 0;

        // while the user input is not to exit, keep looping
        while (input != 9) {
            System.out.println("Please select an option: ");

            // iterate through options and list them out
            for (int iterator = 0; iterator < options.length; iterator++) {
                System.out.println(options[iterator]);
            }
            input = scanner.nextInt();

            // if exit, exit
            if (input == 9)
                break;

            // ask for what student we want, based on how many students are in the gradebook
            System.out
                    .println("Please enter the student number. Between 0 and " + (gradebook.studentClasses.size() - 1));
            student = scanner.nextInt();

            // if the student number is not valid, ask them to enter again
            while (student > gradebook.studentClasses.size() - 1 || student < 0) {
                System.out.println("Please enter a valid student number.");
                student = scanner.nextInt();
            }

            // switch statement to handle the different options
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
                // default to exit and breaking the switch
                default:
                    System.out.println("Not a valid option.");
                    break;

            }

        }

        // thank the user!
        System.out.println("Thank you for using the CATD High School Gradebook!");
    }
}
