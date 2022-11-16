
//IMPORTS
import java.util.Scanner;
import java.io.*;

public class StringsTwo {
    public static void main(String[] args) throws IOException {
        // SET UP FILE READING INPUT THROUGH SCANNER
        Scanner input = new Scanner(new File("StringsTwo.txt"));

        // SET UP FILE WRITING OUTPUT THROUGH PRINTWRITER
        PrintWriter output = new PrintWriter(new File("StringsTwoOutput.txt"));

        // GO THROUGH EVERY LINE IN THE FILE (THERE'S ONLY ONE IN THIS CASE)
        while (input.hasNext()) {
            // MOVE SCANNER INTO THE NEXT
            String line = input.nextLine();

            // DEFINE THE LINE AND JUST CONVERT IT TO LOWERASE
            line = line.toUpperCase();
            int strLength = line.length();
            int strCutoff = (strLength % 2 == 1) ? (int) (strLength / 2 + 1) : strLength / 2;
            String firstHalf = line.substring(0, strCutoff);
            String secondHalf = line.substring(strCutoff, strLength);
            output.println(firstHalf);
            output.println(secondHalf);
        }

        output.close();
    }

}