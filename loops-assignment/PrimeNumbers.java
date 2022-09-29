// Dhairya Gupta

public class PrimeNumbers {
    public static void main(String[] args) {
        boolean prime = true;
        for (int i = 1; i < 100; i++) {
            for (int divisor = 2; divisor < i; divisor++) {
                if (i % divisor == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i + " is a prime number.");
            }
            prime = true;
        }
    }
}
