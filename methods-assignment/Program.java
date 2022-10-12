public class Program {
    public static void main(String[] args) {
        int one = 5, two = 6, three = 7;
        double average;
        average = calcAverages(one, two, three);
        displayAverages(average);
    }

    public static double calcAverages(int one, int two, int three) {
        return (double) ((one + two + three) / 3);
    }

    public static void displayAverages(double averages) {
        System.out.println("The average is: " + averages);
    }
}