import java.util.Scanner;

public class ArraysOne {
    public static void main(String[] args) {
        int[] speeders = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the speed of the car: ");
            speeders[i] = input.nextInt();
        }

        int zeroToTenOver = 0, twentyPlusOver = 0, tenToTwentyOver = 0;
        int highestSpeed = 0;
        float averageSpeed = 0;
        for (int i = 0; i < speeders.length; i++) {
            if (speeders[i] > highestSpeed)
                highestSpeed = speeders[i];
            averageSpeed += speeders[i];
            if (speeders[i] - 55 > 20) {
                twentyPlusOver++;
            } else if (speeders[i] - 55 > 10) {
                tenToTwentyOver++;
            } else if (speeders[i] > 55) {
                zeroToTenOver++;
            }
        }
        averageSpeed /= speeders.length;
        System.out.println("There were " + zeroToTenOver + " cars going 0-10 over the speed limit, " + tenToTwentyOver
                + " cars going 10-20 over the speed limit, and " + twentyPlusOver
                + " cars going 20+ over the speed limit. The average speed was " + averageSpeed
                + " and the highest speed was " + highestSpeed + ".");
    }
}
