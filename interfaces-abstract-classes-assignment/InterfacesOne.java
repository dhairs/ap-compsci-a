import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InterfacesOne implements PhoneBook {

    private String[] names = new String[100];
    private String[] numbers = new String[100];
    private int currentIndex = 0;

    public void ReadInfo() {
        try {
            // since the assignment says to read from a file, i'm going to do that
            // define a new file object and scanner object, and then read the file line by
            // line
            File file = new File("phonebook.txt");
            Scanner scanner = new Scanner(file);

            // while the file has more lines, keep scanning for the next line
            while (scanner.hasNextLine()) {
                // set the current line to a variable
                String line = scanner.nextLine();
                // this literally just breaks the line we have between its number and name
                // (assuming it's the format of "<name> <number>")
                String[] parts = line.split(" ");

                System.out.println("Name: " + parts[0] + " Number: " + parts[1] + "");

                // now just set the name and number to the arrays
                names[currentIndex] = parts[0];
                numbers[currentIndex] = parts[1];

                // increment the index for the next run
                currentIndex++;
            }
            // memory saving stuff -- don't need it -- omit if you want
            scanner.close();
        } catch (FileNotFoundException e) {
            // don't actually need this line, i just have it here because why not
            e.printStackTrace();
        }
    }

    // the find number method
    public String FindNumber(String enteredName) {

        // for each name in the array, check if it's the same as the entered name
        // if it is, return the number at the same index in the numbers array
        for (int i = 0; i < names.length; i++) {
            if (names[i] == (enteredName)) {
                return numbers[i];
            }
        }

        // return "Not found" if the name isn't found
        return "Not found";
    }

    public String FindName(String enteredNumber) {

        // for each number in the array, check if it's the same as the entered number
        // if it is, return the name at the same index in the names array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == enteredNumber) {
                return names[i];
            }
        }

        // return "Not found" if the name isn't found
        return "Not found";
    }

    // main method -- just runs the code
    public static void main(String[] args) {
        InterfacesOne phonebook = new InterfacesOne();
        phonebook.ReadInfo();
        // testing the methods;
        System.out.println(phonebook.FindNumber("Dhairya"));
        System.out.println(phonebook.FindName("123456789"));
    }
}