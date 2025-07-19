package Greedy_ALgorithm;

import java.util.Arrays;

public class MinAbsoluteDifferencePair {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3 ,4};
        int[] B = { 2, 1, 3 ,5};
        int diffSUm = findMinAbsoluteDifPair(A, B);
        System.out.println(diffSUm);
    }
    private static int findMinAbsoluteDifPair(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0; 
        for(int i = 0; i< A.length; i++){
            int diff = A[i] - B[i];
            if(diff >= 0){
                sum += diff;
            }else {
                sum += -diff;
            }
            // sum += Math.abs(diff);
        }
        return sum;
    }
}
