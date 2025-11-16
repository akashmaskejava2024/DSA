package Basic._2DArrays;

import java.util.ArrayList;

public class DigonalTraversal {
    public static void main(String[] args) {

        int[][] mat = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 }
        };
        ArrayList<Integer> res = diagonalOrder(mat);
        for (int val : res) System.out.print(val + " ");

    }

    private static ArrayList<Integer> diagonalOrder(int[][] mat) {

        ArrayList<Integer> list = new ArrayList<>(); 

       int count = 0; 

       while( count < mat.length){

        int i = count; 
        int j = 0; 
        while (i >= 0 && j < mat[0].length) {
            list.add(mat[i--][j++]); 
        }
        count++; 
       }

       count = 1; 
       while( count < mat.length){

        int i = mat.length - 1; 
        int j = count; 
        while (i >= 0 && j < mat[0].length) {
            list.add(mat[i--][j++]); 
        }
        count++; 
       }

       return list; 



    }
}
