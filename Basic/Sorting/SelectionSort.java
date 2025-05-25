package Basic.Sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = { 4, 3, 2, 4, 1, 5 };

        selectionSort(arr);
        printArray(arr);

    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int samllestNo = Integer.MIN_VALUE;
            int smallestIndex = 0;

            for (int j = i; j < arr.length; j++) {

                if (samllestNo < arr[j]) {
                    samllestNo = arr[j];
                    smallestIndex = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = samllestNo;
            arr[smallestIndex] = temp;

        }

    }
}
