package PracticeRevision.Arrays;

public class Largest_No {
    public static void main(String[] args) {
        
        int[] arr = { 1,2,3,4,2,2,4,4,5,6,3,,6,10};

        int max = Integer.MIN_VALUE;


        for(int i = 0; i< arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
