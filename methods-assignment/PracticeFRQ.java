// this file assumes the import of a class 'Draw' with method 'drawLine'

// assume x, y, and len are already initialized with values

public class PracticeFRQ {
    public static void main(String[] args) {

        // initalize x and y purely for testing out the program
        int x = 6, y = 2, len = 4;

        // set len to be the smallest difference between 10 and x or y if there isn't
        // enough space
        // These first 2 if-statements are for the cases where the lines are too long
        // along the top or right
        if (10 - x < len) {
            len = 10 - x;
        }
        if (10 - y < len) {
            len = 10 - y;
        }

        // these are for if the length is too long along the bottom or left of the grid,
        // set len to the max possible value
        if (x < len) {
            len = x;
        }
        if (y < len) {
            len = y;
        }

        // Draw the first line
        Draw.drawLine(x, y, x + len, y);

        // Draw the second line, we subtract len from Y because the first coordinate
        is
        // the top left corner, so we go downwards
        Draw.drawLine(x, y, x, y - len);

        // Draw the third line, we keep `y - len` in both positions because we're
        // drawing the line along the bottom of the square, so y should be constant
        Draw.drawLine(x, y - len, x + len, y - len);

        // Draw the fourth line, we keep `x + len` in both positions because we're
        // drawing the line along the side of the square, so x should be constant
        Draw.drawLine(x + len, y, x + len, y - len);

        System.out.println("side length = " + len + ", area = " + len * len);
    }
}
