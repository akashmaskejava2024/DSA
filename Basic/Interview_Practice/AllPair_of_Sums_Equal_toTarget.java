package Basic.Interview_Practice;

import java.util.HashSet;

public class AllPair_of_Sums_Equal_toTarget {

    public static void main(String[] args) {

        int arr[] = { 2, 4, 3, 7, 1, 9 };
        printAllPairs(arr, 10);


    }

    private static void printAllPairs(int[] arr, int target) {

        HashSet<String> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            for(int j = i + 1; j<arr.length ; j++){
               
                if(arr[i]+arr[j] == target){

                    String pair = "(" + arr[i] + " , " + arr[j] + " ) ";
                    set.add(pair);

                }

            }

        }

        System.out.println(set);


    }
}