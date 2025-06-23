package BackTRacking;


public class SudokuPractice {
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
       sudokuSolver(sudoku, 0, 0);
        printSudoku(sudoku);
    }

    private static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        // base case
        if (row == 9 && col == 0) return true;
        // recursion
        int nextRow = row; 
        int nexCol = col + 1;

        if(col + 1  == 9 ){
            nextRow =  row  + 1; 
            nexCol  = 0; 
        }

        if (sudoku[row][col] == 0) {
            for (int i = 1; i < 10; i++) {
                if (isSafe(sudoku, row, col, i)) {
                    sudoku[row][col] = i;
                    if(sudokuSolver(sudoku, nextRow, nexCol)){
                        return true;
                    }
                    sudoku[row][col] =  0; 
                } 
                
            }
            return false;
        } else {
          return  sudokuSolver(sudoku, nextRow, nexCol);
        }
    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int value) {

        // horzontal check
        for(int i = 0; i < sudoku[col].length; i++){
            if(sudoku[row][i] == value){
                return false;
            }
        }
        
        // vertical Check 
        for(int i = 0 ; i < sudoku.length; i++){
            if(sudoku[i][col] == value){
                return false; 
            }
        }

        // 3 by 3 grid
        int sr = (row / 3) * 3;
        int sc = ( col / 3) * 3;

        for(int i = sr; i < sr + 3; i++){
            for(int j = sc ; j < sc + 3; j++){
                if(sudoku[i][j] == value){
                    return false;
                }
            }
        }
        return true;
    }

    private static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

}
