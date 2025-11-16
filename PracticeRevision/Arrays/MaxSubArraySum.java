package PracticeRevision.Arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int sum = maxSum(arr);
        System.out.println(sum);

    }

    private static int maxSum(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int currSum = calSum(i, j, arr);

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }

        }
        return maxSum;

    }

    private static int calSum(int i, int j, int[] arr) {

        int sum = 0; 
        for(int k = i ; k <= j; k++){
            sum += arr[k]; 
        }
        return sum;

    }
}
