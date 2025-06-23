package BackTRacking;

public class Sudoku {

    public static void main(String[] args) {

        int[][] sudoku = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        solveSudoku(sudoku, 0, 0);
        printSudoku(sudoku);

    }

    private static void printSudoku(int[][] sudoku) {

        for(int i = 0 ;i< sudoku.length; i++){
            for( int j  = 0; j< sudoku.length;j++ ){
                 System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static boolean solveSudoku(int[][] sudoku, int row, int col) {

        // base case
        if (row == 9)
            return true;

        // recursion for the next cell
        int nextRow = row;
        int nexCol = col + 1;
        if (nexCol == 9) {
            nextRow = row + 1;
            nexCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return solveSudoku(sudoku, nextRow, nexCol);
        } else {
            for (int digit = 0; digit < 10; digit++) {
                if (isSafe(sudoku, row, col, digit)) {
                    sudoku[row][col] = digit;
                    if (solveSudoku(sudoku, nextRow, nexCol)) {
                        return true;
                    }
                    sudoku[row][col] = 0;
                }
            }
        }
        return false;

    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int digit) {

        // horizontal checkup
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }
        }

        // verttical checkup
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int r = sr; r < sr + 3; r++) {
            for (int c = sc; c < sc + 3; c++) {
                if (sudoku[r][c] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

}
