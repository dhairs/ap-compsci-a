
// Dhairya Gupta
import java.util.Scanner;

public class VariablesTwo {
    public static void main(String[] args) {
        // Define and initialize new variable 'input' of type Scanner to read from the
        // console
        Scanner input = new Scanner(System.in);

        // Read in circle radius value from the user
        System.out.print("Enter a radius: ");
        int userRadius = input.nextInt();

        // Calculate all requested fields for the circle (Diameter, Surface Area,
        // Volume, Circumference)
        double circleDiameter = userRadius * 2;
        double circleSurfaceArea = Math.PI * 4 * Math.pow(userRadius, 2);
        double circleVolume = (4.0 / 3.0) * Math.PI * Math.pow(userRadius, 3);
        double circleCircumference = 2 * Math.PI * userRadius;

        // Print out all requested fields for the circle
        System.out.println("Diameter: " + circleDiameter);
        System.out.println("Surface Area: " + circleSurfaceArea);
        System.out.println("Volume: " + circleVolume);
        System.out.println("Circumference: " + circleCircumference);

        // Close the Scanner object so there aren't any memory leaks
        input.close();
    }
}