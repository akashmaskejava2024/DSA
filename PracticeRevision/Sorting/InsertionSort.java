package PracticeRevision.Sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = { 12, 32, 34, 11, 98, 87, 45, 23, 102 };

        insertionSort(arr);

    }

    private static void insertionSort(int[] arr) {


        int n = arr.length;
        int[] sortedArr = new int[n];
        sortedArr[0] = arr[0];

        for(int i = 1 ; i< n ; i++){

            int currValue = arr[i]; 
            int prev = i -1;

            while(prev >= 0 && arr[prev] > currValue){
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = currValue;
        }

        for(int i = 0;i< arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }

        

    }
}
