package Basic.Interview_Practice;

public class Zero_In_Matrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 },
                { 1, 2, 3 },
                { 1, 0, 3 },
        };

        makeRowAndColumnZeroIfGotZero(matrix);

    }

    private static void makeRowAndColumnZeroIfGotZero(int[][] matrix) {

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                if(matrix[i][j] == 0){
                    for(int h =0; h<matrix.length; h++){
                        matrix[h][j] = 0;
                        matrix[i][h] = 0;
                        
                    }
                    break;
                }
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}
