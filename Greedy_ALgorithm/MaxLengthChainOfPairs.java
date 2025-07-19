package Greedy_ALgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPairs {
    public static void main(String[] args) {
        int[][] pairs = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        int noOfPairs = findMaxCHainofPairs(pairs);
        System.out.println("No of Pairs is :" + noOfPairs);
    }
    public static int findMaxCHainofPairs(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));
        int end = pairs[0][1];
        int count = 1; 
        System.out.println(pairs[0][0] + " " + pairs[0][1]);
        for(int i = 1; i< pairs.length; i++){
            int start = pairs[i][0];
            if(start >= end){
                end = pairs[i][1];
                count++;
                System.out.println(pairs[i][0] + " " + pairs[i][1]);
            }
        }
        return count;
    }
}
