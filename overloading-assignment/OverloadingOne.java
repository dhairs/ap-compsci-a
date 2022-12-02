import java.util.Scanner;

public class OverloadingOne {
    private static OverloadingOneOperations operations = new OverloadingOneOperations();

    // variables for each type of data
    public static int[] intNumbers = new int[2];
    public static double[] doubleNumbers = new double[2];
    public static float[] floatNumbers = new float[2];

    public static int dataTypeClass;

    public static void main(String[] args) {
        // set up scanner
        Scanner input = new Scanner(System.in);

        // ask user for what kind of operation they want to do
        System.out.println("Would you like to add (1), subtract (2), multiply (3), or divide (4)?");
        int operationType = input.nextInt();

        // ask the user for the type of data they are inputting
        System.out.println("Would you like to input integers (1), doubles (2), or floats(3)?");
        int dataType = input.nextInt();
        dataTypeClass = dataType;

        // ask user for the two numbers they want to use
        System.out.print("Enter in the numbers: ");

        // based on the type of data, add to the correct array
        switch (dataType) {
            case 1:
                addToArray(input.nextInt(), input.nextInt());
                break;
            case 2:
                addToArray(input.nextDouble(), input.nextDouble());
                break;
            case 3:
                addToArray(input.nextFloat(), input.nextFloat());
                break;
        }

        // just runs the operations based on type
        switch (operationType) {
            case 1:
                runAdd();
                break;
            case 2:
                runSubtract();
                break;
            case 3:
                runMultiply();
                break;
            case 4:
                runDivide();
                break;
        }
    }

    // the methods/functions below are used to add the numbers to the corresponding
    // arrays. They are all overloaded so that it can accept all three data types
    private static void addToArray(int num1, int num2) {
        intNumbers[0] = num1;
        intNumbers[1] = num2;
    }

    private static void addToArray(double num1, double num2) {
        doubleNumbers[0] = num1;
        doubleNumbers[1] = num2;
    }

    private static void addToArray(float num1, float num2) {
        floatNumbers[0] = num1;
        floatNumbers[1] = num2;
    }

    // each of the methods below just run the operation and print out the result
    // based on the type of data selected
    private static void runAdd() {
        if (dataTypeClass == 1) {
            System.out.println(operations.add(intNumbers[0], intNumbers[1]));
        } else if (dataTypeClass == 2) {
            System.out.println(operations.add(doubleNumbers[0], doubleNumbers[1]));
        } else if (dataTypeClass == 3) {
            System.out.println(operations.add(floatNumbers[0], floatNumbers[1]));
        }
    }

    private static void runSubtract() {
        if (dataTypeClass == 1) {
            System.out.println(operations.subtract(intNumbers[0], intNumbers[1]));
        } else if (dataTypeClass == 2) {
            System.out.println(operations.subtract(doubleNumbers[0], doubleNumbers[1]));
        } else if (dataTypeClass == 3) {
            System.out.println(operations.subtract(floatNumbers[0], floatNumbers[1]));
        }
    }

    private static void runMultiply() {
        if (dataTypeClass == 1) {
            System.out.println(operations.multiply(intNumbers[0], intNumbers[1]));
        } else if (dataTypeClass == 2) {
            System.out.println(operations.multiply(doubleNumbers[0], doubleNumbers[1]));
        } else if (dataTypeClass == 3) {
            System.out.println(operations.multiply(floatNumbers[0], floatNumbers[1]));
        }
    }

    private static void runDivide() {
        if (dataTypeClass == 1) {
            System.out.println(operations.divide(intNumbers[0], intNumbers[1]));
        } else if (dataTypeClass == 2) {
            System.out.println(operations.divide(doubleNumbers[0], doubleNumbers[1]));
        } else if (dataTypeClass == 3) {
            System.out.println(operations.divide(floatNumbers[0], floatNumbers[1]));
        }
    }

}
