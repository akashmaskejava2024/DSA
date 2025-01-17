package Basic.Interview_Practice;

public class check_Symmytric_Matrix {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 },
                           { 2, 4, 5 }, 
                           { 3, 5, 6 } 
                         };

       System.out.println( chaeckForSymmitry(matrix));;

    }

    private static boolean chaeckForSymmitry(int[][] matrix) {

        for(int i = 0; i<matrix.length; i++){

            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j] == matrix[j][i]){
                    return true;
                    
                }
            }


        }
                return false;

    }
}