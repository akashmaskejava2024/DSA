package PracticeRevision.Sorting;

import Basic.Interview_Practice.count_no_chars;

public class CountingSort {
    public static void main(String[] args) {

        int[] arr = { 12, 32, 34, 11, 98, 87, 45, 23, 102 };

        countingSort(arr);
    }

    private static void countingSort(int[] arr) {

        int largest = Integer.MIN_VALUE; 

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i]; 
            }
        }


        
        int[] count = new int[largest + 1];

        for(int i = 0; i< arr.length  ; i++){
            count[arr[i]]++;
        }

        int j= 0;
        for(int i =0; i < count.length; i++){
            if(count[i] > 0){
                arr[j++] = i;
                count[i]--;
            }
           
        }

        for(int i = 0;i< arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
}
