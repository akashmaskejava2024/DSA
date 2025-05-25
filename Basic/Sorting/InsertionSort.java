package Basic.Sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = { 5, 3, 4, 3, 7, 2 };

        insertionSort(arr);
        printArray(arr);
    }


    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    


    private static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }
}
