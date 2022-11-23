// run this file to see what mat ends up looking like
public class QuizPartTwo {
    public static void main(String[] args) {
        int[][] mat = new int[3][4];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (row < col) {
                    mat[row][col] = 1;
                } else if (row == col) {
                    mat[row][col] = 2;
                } else {
                    mat[row][col] = 3;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][0] + " " + mat[i][1] + " " + mat[i][2] + " " + mat[i][3]);
        }
    }
}
