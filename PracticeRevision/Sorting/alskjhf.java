package PracticeRevision.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

class GfG {

    static ArrayList<int[]> mergeOverlap(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            // skip those already merged intervals
            if(!res.isEmpty() && res.get(res.size() - 1)[1] >= end) continue;

            //checking for other possible ranges 
            for(int j = i + 1; j< n; j++){
                if(arr[j][1] < end){
                    end = Math.max(end, arr[j][1]);
                }
            }
            res.add(new int[]{start, end});
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = { { 7, 8 }, { 1, 5 }, { 2, 4 }, { 4, 6 } };
        ArrayList<int[]> res = mergeOverlap(arr);

        for (int[] interval : res) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}