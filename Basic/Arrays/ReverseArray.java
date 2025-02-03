package Basic.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int arr[] = { 12, 3, 4, 5, 5, 6, 5 };

        int revArr[] = reverseArray(arr);

        for(int i =0; i<revArr.length; i++){
            System.out.println(revArr[i]);
        }
    }

    private static int[] reverseArray(int[] arr) {

        int start = 0;
        int end = arr.length -1;

        while(start <= end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;


        }

        return arr;


    }
}