package Basic.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Allcombinationsofsizer {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int r = 2;
        List<List<Integer>> res = findCombinations(arr, r);
        for (List<Integer> comb : res) {
            for (int num : comb) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    private static List<List<Integer>> findCombinations(int[] arr, int r) {
        List<Integer> data = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
         combinationsUtil(0, data, result, arr, r);
         return result; 
    }
    private static void combinationsUtil(int idx, List<Integer> data, List<List<Integer>> result,
            int[] arr, int r) {
                // base case if 
                if(data.size() == r){
                    // becasue the data is List as declared
                    result.add(new ArrayList<>(data)); 
                    return; 
                }
                for(int i = idx ; i < arr.length; i++){
                    // add new ele in the compbination
                    data.add(arr[i]); 
                    // go for the next ele for new combination
                    combinationsUtil(idx + 1, data, result, arr, r); 
                    // Backtrack to find another combination
                    data.remove(data.size() - 1);
                }
    }
}
