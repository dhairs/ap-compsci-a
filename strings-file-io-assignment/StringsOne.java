
//IMPORTS
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class StringsOne {
    public static final String[] vowels = new String[] { "a", "e", "i", "o", "u" };

    public static void main(String[] args) throws IOException {
        // SET UP FILE READING INPUT THROUGH SCANNER
        Scanner input = new Scanner(new File("StringsOne.txt"));

        // GO THROUGH EVERY LINE IN THE FILE (THERE'S ONLY ONE IN THIS CASE)
        while (input.hasNext()) {
            // MOVE SCANNER INTO THE NEXT
            String line = input.nextLine();

            // DEFINE THE LINE AND JUST CONVERT IT TO LOWERASE
            line = line.toLowerCase();

            // BREAK THE LINE INTO EACH INDIVIDUAL CHARACTER SO I CAN ANALYZE IT LATER
            String[] characters = line.split("");

            // MAKE A NEW ARRAY LIST SO I CAN ADD THE FINAL STRING TO IT
            ArrayList finalStr = new ArrayList<String>();

            // FOR EVERY CHARACTER IN THE STRING, CHECK IF ITS A VOWEL USING THE ISVOWEL
            // METHOD
            for (String character : characters) {
                if (!isVowel(character)) {
                    // IF NOT A VOWEL, ADD IT TO THE FINAL STRING
                    finalStr.add(character);
                }
            }
            // CONVERT THAT FINALSTR ARRAY INTO A STRING AND JOIN THE ARRAY STRING WITH
            // EMPTY SPACES TO REFORM THE SENTENCE
            System.out.println(finalStr.toString().join("", finalStr));
        }

    }

    // DEFINE METHOD TO CHECK IF A CHARACTER IS A VOWEL
    public static boolean isVowel(String character) {

        // FOR EVERY VOWEL IN THE VOWELS ARRAY, CHECK IF THE CHARACTER IS EQUAL TO IT
        for (String vowel : vowels) {
            if (character.equals(vowel)) {
                // IF EQUAL, RETURN TRUE, MEANING THE CHRACTER IS A VOWEL
                return true;
            }
        }
        // IF NO MATCHES, RETURN FALSE
        return false;
    }

}