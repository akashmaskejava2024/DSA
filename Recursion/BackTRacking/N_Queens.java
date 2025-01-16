package BackTRacking;

import java.util.ArrayList;
import java.util.List;

public class N_Queens {
    // Main method
    public static void main(String[] args) {
        int n = 4; // Change n to solve for a different size board
        List<List<String>> allBoards = solveNQueens(n);
        System.out.println("Total Solutions: " + allBoards.size());
        for (List<String> board : allBoards) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    // Solve N-Queens
    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> allBoards = new ArrayList<>();
        // to return all the possible solutions list and these solutions will be in list
        // format like [".Q.","Q.."],etc

        char[][] board = new char[n][n]; // creating board with n rows and n columns
        helper(board, allBoards, 0);
        return allBoards;
        // to apply recursion on all the columns we need another method

    }

    // as we are going to call this recursion on every column to see , we nned int
    // col
    public static void helper(char[][] board, List<List<String>> allBoards, int col) {

        // base condition like if column is the last column now like col== board.length
        if (col == board.length) {
            saveBoards(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                // if the Queen is placed in this col at this row then call helper to next col
                helper(board, allBoards, col + 1);
                // but if while backtracking the solution we'll find that
                // board[row][col]= 'Q'; at this place Q is wrong
                board[row][col] = '.';
            }
        }

    }

    private static void saveBoards(char[][] board, List<List<String>> allBoards) {
        String row = ""; // String which will store "..Q.",etc
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == 'Q') {
                    row += "Q";
                } else {
                    row += ".";
                }

            }
            // after completetion of every row We should add it into the boardList
            newBoard.add(row);

        }
        allBoards.add(newBoard);

    }

    private static boolean isSafe(int row, int col, char[][] board) {
        // step by step check if vetically, horizntally, upper-left, etc all directionos
        // are safe for the queen

        // horizontal
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        // vertical
        for (int i = 0; i < board[0].length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // upper left
        for (int c = col, r = row; c >= 0 && r >= 00; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // upper-right
        for (int c = col, r = row; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower left
        for (int c = col, r = row; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower-right
        for (int c = col, r = row; c < board.length && r < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

}