package PracticeRevision.Arrays;

public class KadanesMaxSubArraySum {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int sum = findMaxSum(arr);

        System.out.println(sum);

    }

    private static int findMaxSum(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        int currSum = 0; 
        int start = 0; 
        int end= 0; 
        int tempStart = 0; 

        for(int i= 0; i< arr.length; i++){

            currSum += arr[i]; 

            if(currSum >= maxSum){
                maxSum = currSum; 
                start = tempStart; 
                end = i; 
            } 

            if(currSum < 0){
                tempStart = i + 1; 
                currSum = 0; 
            }



        }
        for(int i = start; i< end; i++) System.out.print(arr[i] + " ");

        return maxSum;

    }

}
