import java.util.Scanner;

public class Conversions {
    public static void main(String[] args) {

        // setup the scanner
        Scanner input = new Scanner(System.in);

        // set variables we will input
        int conversionChoice, number;

        // ask user for their choice
        System.out.println(
                "What would you like to convert? (1) feet to inches (2) centimeters to inches (3) miles to meters (4) miles to feet (5) pounds to ounces (6) kilowatts to horsepower");
        conversionChoice = input.nextInt();

        // ask user for number they want to convert
        System.out.println("Enter the number you would like to convert");
        number = input.nextInt();

        switch (conversionChoice) {
            case 1:
                System.out.println(feetToInches(number) + " inches");
                break;
            case 2:
                System.out.println(centimetersToInches(number) + " inches");
                break;
            case 3:
                System.out.println(milesToMeters(number) + " meters");
                break;
            case 4:
                System.out.println(milesToFeet(number) + " feet");
                break;
            case 5:
                System.out.println(poundsToOunces(number) + " ounces");
                break;
            case 6:
                System.out.println(kilowattsToHorsepower(number) + " horsepower");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

    }

    // create methods for each conversion and retunrn the valu, the method itself
    // will not print anything: we will print the return value in the main method

    public static int feetToInches(int number) {
        return number * 12;
    }

    public static double centimetersToInches(int number) {
        return number / 2.54;
    }

    public static double milesToMeters(int number) {
        return number * 1609.34;
    }

    public static int milesToFeet(int number) {
        return number * 5280;
    }

    public static int poundsToOunces(int number) {
        return number * 16;
    }

    public static double kilowattsToHorsepower(int number) {
        return number * 1.34102209;
    }
}