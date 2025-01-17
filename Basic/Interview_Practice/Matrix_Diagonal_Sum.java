package Basic.Interview_Practice;

public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                           { 2, 4, 5, 6 },
                           { 3, 5, 6, 10 },
                           { 3, 5, 6, 10 },
        };

        calcSumOfDiagonals(matrix);

    }

    private static void calcSumOfDiagonals(int[][] matrix) {

        int first = 0;
        int last = 0;
        int sum = 0;
        // from top-left to bottom-right

        while ((first <= matrix.length-1 && last <= matrix[matrix.length-1].length-1)) {
            sum += matrix[first++][last++];

        }
        System.out.println("Sum frm top-left to Bottom-right " + sum);
        first = 0;
        last = matrix[0].length-1;
        sum = 0;

        while (first <= matrix.length-1  && last >= 0) {
            sum += matrix[first++][last--];
            
        }
        System.out.println("Sum from top-right to Bottom-left " + sum);


    }
}
