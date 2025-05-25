package Basic.Sorting;

public class CuontingSort {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 2, 7, 4, 3, 5 };


        int[] arr1 = countingSort(arr);
        
        printArray(arr1);
    }


    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }


    public static int[] countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int[] count = new int[largest + 1];
        // count the frequency
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        // printing according to count
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            }
        }
        return arr;
    }
}
