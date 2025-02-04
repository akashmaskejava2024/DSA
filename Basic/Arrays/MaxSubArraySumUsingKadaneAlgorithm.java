package Basic.Arrays;

public class MaxSubArraySumUsingKadaneAlgorithm {
    public static void main(String[] args) {

        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        printMaxSubArraySum(arr);
    }

    private static void printMaxSubArraySum(int[] arr) {

        int firstIndex = 0;
        int lastindex = 0;

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
           
            
            if (maxSum < currSum) {
                maxSum = currSum;
                lastindex = i;
            }
            
            if (currSum <= 0) {
                firstIndex = i+1;
                currSum = 0;

            } 

        }


        for(int i = firstIndex; i<=lastindex; i++){
            if(i<lastindex){
                System.out.print(arr[i] +" + ");
            } else {
                System.out.print(arr[i] );
            }
        } 
        System.out.print(" = "+ maxSum);
    }
}
