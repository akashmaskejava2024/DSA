package Basic._2DArrays.Practice;

public class TransposeMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                { 11, 12, 13 },
                { 14, 15, 16 }
        };
        swapMatrix(matrix);
    }

    private static void swapMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] newMatrix = new int[cols][rows];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                    newMatrix[col][row] = matrix[row][col];
            }
        }
        for (int[] row : newMatrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
