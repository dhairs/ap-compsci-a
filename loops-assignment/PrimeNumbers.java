// Dhairya Gupta

public class PrimeNumbers {
    public static void main(String[] args) {

        // Default to a number being prime
        boolean prime = true;

        // Loop through every number to 100
        for (int i = 1; i < 100; i++) {

            // For every number between 2 and the number, check if it is divisible by the
            // number
            for (int divisor = 2; divisor < i; divisor++) {

                // If divisible, the number is not prime and the loop can be broken
                if (i % divisor == 0) {
                    prime = false;
                    break;
                }

                // otherwise, the value of prime is true
            }

            // If the number is prime, print it
            if (prime) {
                System.out.println(i + " is a prime number.");
            }

            // Reset prime to true for the next number
            prime = true;
        }
    }
}
