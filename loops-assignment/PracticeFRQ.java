public class PracticeFRQ {
    public static void main(String[] args) {

        int value = 4, numRounds = 5;

        // loop this loop numRounds times, with variable x as the iterator

        // set the value of i to 0 as default
        int i = 0;
        while (i < numRounds) {
            // set a variable to compare to, set default to -1 so it has to run the nested
            // loop at least once
            int generatedNum = 0;

            // while not the value, keep nested looping and generating a random number
            while (generatedNum != value) {
                // Generate a random number 1-9
                generatedNum = (int) (Math.random() * 9) + 1;

                // Print out the number that was generated
                // if the number is the value, then print and go to next line
                if (generatedNum != value)
                    // stays on same line
                    System.out.print(generatedNum);
                else
                    // prints new line
                    System.out.println(generatedNum);

                // once the value is reached, the loop ends

            }
            // increase the value of i by 1 so it works
            i = i + 1;

        }
    }
}
