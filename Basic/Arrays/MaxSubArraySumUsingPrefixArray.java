package Basic.Arrays;

public class MaxSubArraySumUsingPrefixArray {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        findMaxSubArraySum(arr);

    }

    private static void findMaxSubArraySum(int[] arr) {


        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1;i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i]; 
        }
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0;i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){

            currSum = i ==0 ? prefix[j] : prefix[j] - prefix[i-1];
            System.out.println(currSum); 
            if(currSum > maxSum){
                maxSum = currSum;
            }

            }
        }

        System.out.println("Maximum Sum would be : " + maxSum);




    }
}
