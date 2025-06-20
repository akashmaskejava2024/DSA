package BackTRacking;

public class NQueensWithoutSafety {
    public static void main(String[] args) {

        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
    }

    public static void nQueens(char[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // column loop
        for (int col = 0; col < board.length; col++) {
            // if (isSafe(board, row, col))
                board[row][col] = 'Q';
            nQueens(board, row + 1);
            board[row][col] = '.';
        }
    }

    // private static boolean isSafe(char[][] board, int row, int col) {

    //     boolean isSafe = true;

    //     for(int i = 0; i < board.length; i++){
    //         if(board[row][i] == 'Q' || board[i][col] == 'Q' ){
    //             return false;
    //         }
    //     }

    // }

    private static void printBoard(char[][] board) {
        System.out.println("________Chess Board________");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
