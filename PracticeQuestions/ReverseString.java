package PracticeQuestions;

import java.lang.reflect.Array;

import Basic.Interview_Practice.first_nonReapiting_Char;

public class ReverseString {
    public static void main(String[] args) {

        

    }

    private static void reverseArray(int[] arr) {

        // int[] revArr = new int[arr.length];
        // int count = 0;

        // for (int i = arr.length - 1; i >= 0; i--) {
        //     revArr[count++] = arr[i];
        // }

        int first = 0; 
        int last = arr.length - 1; 

        while(first <= last){

            // int temp= arr[last];
            // arr[last] = arr[first];
            // arr[first] = temp;

            arr[first] = arr[first] + arr[last];
            arr[last] = arr[first] - arr[last];
            arr[first] = arr[first] - arr[last];

            first++;
            last--;

        }



        for(int a : arr){
            System.out.print(a + " ");
        }

    }

    public static void reverseString(String str) {

        String revStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }

        System.out.println(revStr);
    }

}
