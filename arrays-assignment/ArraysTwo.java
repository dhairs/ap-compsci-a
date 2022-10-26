public class ArraysTwo {
    public static void main(String[] args) {
        int[] randomized = new int[100];
        for (int i = 0; i < 99; i++) {
            randomized[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < randomized.length; i++) {
            System.out.println(randomized[i]);
        }
        for (int i = 0; i < randomized.length; i++) {
            System.out.println(randomized[99 - i]);
        }
        for (int i = 0; i < 99; i++) {
            int count = 0;
            for (int j = 0; j < randomized.length; j++) {
                if (randomized[i] == randomized[j]) {
                    count++;
                }

            }
            System.out.println("The number " + randomized[i] + " appears " + count + " times.");
        }
    }
}
