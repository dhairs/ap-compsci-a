import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        double temperatureCelsius;
        System.out.println("Enter temperature in Fahrenheit to convert:");
        double tempInput = reader.nextDouble();
        temperatureCelsius = (tempInput - 32.0) * 5.0 / 9.0;
        System.out.println(tempInput + " degrees Fahrenheit is " +
                temperatureCelsius + " degrees Celsius.");
        reader.close();
    }
}