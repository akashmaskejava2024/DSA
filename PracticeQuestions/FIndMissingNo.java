package PracticeQuestions;

public class FIndMissingNo {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,6,7,8,9};


    int n = arr[arr.length -1];

        int expSum = n * (n + 1) / 2;

        int sum = 0; 
        for(int a : arr){
        sum += a;
        }


        int missingNo = expSum - sum; 
        System.out.println(missingNo);



    }
}
