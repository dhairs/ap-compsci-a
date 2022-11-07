import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Gradebook {

    // Define the class variables, maxClasses is designed to let you change the
    // number of classes if you want in the future without changing any other code
    int maxClasses = 4;
    public Scanner scanner = new Scanner(System.in);

    // define the class HashMaps that will store all the variables and data
    public ArrayList<Map<Integer, Integer>> studentClasses = new ArrayList<Map<Integer, Integer>>();
    public ArrayList<Map<Integer, Integer>> studentAttendance = new ArrayList<Map<Integer, Integer>>();
    public ArrayList<Map<Integer, Integer>> studentGrades = new ArrayList<Map<Integer, Integer>>();

    // just the options the user has for classes
    public static final String[] classOptions = { "Math", "Science", "English", "History", "Art", "Music", "PE",
            "Spanish" };

    // constructor for the class
    public Gradebook(int students) {

        // iterate through the number of students and create empty hashmaps for all of
        // them
        for (int iterator = 0; iterator < students; iterator++) {

            Map<Integer, Integer> emptyClasses = new HashMap<Integer, Integer>();

            studentClasses.add(emptyClasses);

            Map<Integer, Integer> emptyAttendance = new HashMap<Integer, Integer>();
            studentAttendance.add(emptyAttendance);

            Map<Integer, Integer> emptyGrades = new HashMap<Integer, Integer>();
            studentGrades.add(emptyGrades);
        }
        System.out.println("Welcome to the CATD High School Gradebook!");
    }

    // define the addClasses method, which takes in a a parameter of student number
    public void addClasses(int student) {

        for (int iterator = 0; iterator < maxClasses; iterator++) {

            // Ask user to select a class
            System.out.println("Please enter the class number for the class you would like to add.");

            // Iterate through classOptions array and print out the options
            for (int i = 0; i < classOptions.length; i++) {
                System.out.println(i + ": " + classOptions[i]);
            }
            int classNumber = scanner.nextInt();

            // If the number the user entered is not a valid class number, ask them to enter
            // again until they enter correctly
            while (classNumber >= classOptions.length) {
                System.out.println("Please enter a valid class number.");
                classNumber = scanner.nextInt();
            }

            // once the user has entered a valid class number, add it to the student's class
            // array
            studentClasses.get(student).put(iterator, classNumber);
        }
    }

    // define the addGrade method, which takes in a a parameter of student
    public void addGrade(int student) {
        // iterate through every class the student has
        for (int iterator = 0; iterator < studentClasses.get(student).size(); iterator++) {

            // ask to enter the grade for each class
            System.out.println("Please enter the grade (between 0 and 100) for "
                    + classOptions[studentClasses.get(student).get(iterator)]);
            int grade = scanner.nextInt();

            // if the grade is not in the correct range, keep asking to enter a valid one
            while (grade > 100 || grade < 0) {
                System.out.println("Please enter a valid grade.");
                grade = scanner.nextInt();
            }
            // set the grade of a selected class to be the grade the user entered
            studentGrades.get(student).put(studentClasses.get(student).get(iterator), grade);
        }
    }

    // define the addAttendance method, which takes in a a parameter of student
    public void addAttendance(int student) {
        // iterate through every class the student has
        for (int iterator = 0; iterator < studentClasses.get(student).size(); iterator++) {

            // ask to enter the grade for each class
            System.out.println("Please enter the attendance percentage (between 0 and 100) for "
                    + classOptions[studentClasses.get(student).get(iterator)]);
            int attendance = scanner.nextInt();

            // if the grade is not in the correct range, keep asking to enter a valid one
            while (attendance > 100 || attendance < 0) {
                System.out.println("Please enter a valid attendance percentage.");
                attendance = scanner.nextInt();
            }
            // set the grade of a selected class to be the grade the user entered
            studentAttendance.get(student).put(studentClasses.get(student).get(iterator), attendance);
        }
    }

    // define the displayClasses method, take in a student id as paramter and print
    // classes out in the terminal
    public void displayClasses(int student) {
        System.out
                .println("Student " + student + " is enrolled in the following classes:");

        // iterate through the student's classes and print out the class names
        for (int key = 0; key < studentClasses.get(student).size(); key++) {
            System.out.println(classOptions[key]);
        }
    }

    // define the displayGrades method, take in a student id as paramter and print
    public void displayGrades(int student) {
        System.out.println("Student " + student + " has the following grades:");

        // iterate through the student's grades and print out the class names and grades
        for (int key = 0; key < studentClasses.get(student).size(); key++) {
            int usrClass = studentClasses.get(student).get(key);
            System.out.println(
                    classOptions[usrClass] + ": "
                            + studentGrades.get(student).get(usrClass));
        }
    }

    // define the displayAttendance method, take in a student id as paramter and
    // print
    public void displayAttendance(int student) {
        System.out.println("Student " + student + " has the following attendance:");

        // iterate through the student's attendance and print out the class names and
        // percentage
        for (int key = 0; key < studentClasses.get(student).size(); key++) {
            int usrClass = studentClasses.get(student).get(key);

            System.out.println(
                    classOptions[usrClass] + ": "
                            + studentAttendance.get(student).get(usrClass));
        }
    }

}
