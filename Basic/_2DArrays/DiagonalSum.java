package Basic._2DArrays;


public class DiagonalSum {

    public static void main(String[] args) {

        int[][] matrix = {
            { 1,  2,  3,  4,  5 },
            { 6,  7,  8,  9, 10 },
            {11, 12, 13, 14, 15 },
            {16, 17, 18, 19, 20 },
            {21, 22, 23, 24, 25 }
        };
        System.out.println(printDiagonalSum(matrix));
    }

    private static int printDiagonalSum(int[][] matrix) {

        int col = 0; 
        int row = 0;
        int n = matrix.length -1 ;
        int sum = 0;
        while(col <= matrix[0].length -1 && row <= matrix.length -1){
            sum += matrix[row++][col++];
        }
        col = 0; 
        row = matrix.length -1;
        while(col <= matrix[0].length - 1 && row >= 0){
            sum += matrix[row--][col++];
        }
        sum -= matrix[n/2][n/2];
        
        return sum;
    }
}
