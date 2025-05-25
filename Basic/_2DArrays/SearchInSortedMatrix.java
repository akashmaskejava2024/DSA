package Basic._2DArrays;

public class SearchInSortedMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };

        int key = 23;
        SearchInSortedmatrix(matrix, key);

    }

    private static void SearchInSortedmatrix(int[][] matrix, int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (matrix[row][col] != key) {
            if (key < matrix[row][col] ) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println((col+1) + " " + (row + 1) + " " + matrix[row][col]);

        int col = 0;
        int row = matrix.length - 1;

        while(matrix[row][col] != key){
            if(key < matrix[row][col] ){
                row--;
            } else {
                col++;
            }
        }

                System.out.println((col+1) + " " + (row + 1) + " " + matrix[row][col]);


    }
}
