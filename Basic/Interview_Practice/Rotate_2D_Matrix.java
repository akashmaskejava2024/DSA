package Basic.Interview_Practice;

public class Rotate_2D_Matrix {

    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3 },
                { 1, 2, 3 },
                { 1, 2, 3 },
        };

        rotateMatrix(matrix);
    }

    private static void rotateMatrix(int[][] matrix) {

        int[][] newMatrix = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                newMatrix[i][j] = matrix[j][i];

            }
        }

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix.length; j++) {
                
                System.out.print(newMatrix[i][j] + " ");

            }
            System.out.println();
        }

    }
}
