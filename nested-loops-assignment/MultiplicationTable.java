// Dhairya Gupta
public class MultiplicationTable {
    public static void main(String[] args) {
        int columns = 13, rows = 13;
        /// iterate for every row
        for (int rowIterator = 0; rowIterator < rows; rowIterator++) {
            // for every row, iterate for every column. We do it this way because println()
            // moves to the next row, so we have to get columns out of the way first
            for (int columnIterator = 0; columnIterator < columns; columnIterator++) {
                // if we're in the top right corner, just don't print anything
                if (rowIterator == 0 && columnIterator == 0) {
                    System.out.print("  ");
                } else if (rowIterator == 0) {

                    // if we're in the top ROW, print the column number (the numbers going along the
                    // top)
                    System.out.print(columnIterator + " ");

                } else if (columnIterator == 0) {
                    // if we're in the left COLUMN, print the row number (the numbers going down the
                    // side)
                    System.out.print(rowIterator + " ");
                } else {
                    // print the product of the row and column and populate the table
                    System.out.print(rowIterator * columnIterator + " ");
                }
            }
            // print an empty space to move cursor to next line for the next row
            System.out.println("");
        }
    }
}
