package PracticeRevision.Arrays;

public class TrappedWater {
    public static void main(String[] args) {

        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };

        findTrappingRainwater(arr);

    }

    private static void findTrappingRainwater(int[] arr) {

        int totalTrappedWater = 0; 
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];

        int n = arr.length;

        leftMax[0] = arr[0]; 
        rightMax[n -1 ] = arr[n - 1];

        for(int i = 1; i< arr.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        for(int i  = n -2  ; i >= 0 ; i--){
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }
        for(int i = 0; i< arr.length; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            int trappedWater = waterlevel - arr[i]; 
            totalTrappedWater += trappedWater;
        }
        System.out.println(totalTrappedWater);
    }
}
