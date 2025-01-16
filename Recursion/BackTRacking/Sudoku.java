package BackTRacking;

public class Sudoku {

    // to use the recursion in traversing
    public static boolean helper(char[][] board, int row, int col) {

        // base case
        if (row == board.length) {
            return true;
        }

        // while traversing in the grid, to go on next column and next row according
        int nrow = 0;
        int ncol = 0;
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        // check if the box you are in has any number or not
        if (board[row][col] != '.') {
            // if not then call helper with new row and col so that it would traverse to new
            // rows and cols and if it would ge the fial solution it woold it should return
            // true
            if (helper(board, nrow, ncol)) {
                return true;
            } else {
                // if the dot is there then try to fit the no. over there
                for (int i = 1; i <= 9; i++) {
                    if (isSafe(board, row, col, i)) {
                        board[row][col] = (char) (i + 'o');
                        if (helper(board, nrow, ncol)) {
                            return true;
                        } else {
                            // at some point later after saving the no. it will find the problem then again
                            // '.'
                            board[row][col] = '.';
                            // and now it will go with next i
                        }

                    }
                }
            }

        }
        // if any kind of true is not returned then return false
        return false;
    }

    private static boolean isSafe(char[][] board, int row, int col, int number) {

        for (int i = 0; i < board.length; i++) {
            // in a vertical column
            if (board[i][col] == (char) (number - '0')) {
                return false;
            }
            // in horizontal row
            if (board[row][i] == (char) (number - '0')) {
                return false;
            }
        }

        // to check in the grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number - '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void solveSudoku(char[][] board) {

        // call helper to start with (0,0)
        helper(board, 0, 0);
    }

}
