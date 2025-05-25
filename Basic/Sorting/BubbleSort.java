package Basic.Sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int[] sortedArr = bubbleSortArr(arr);
        for (int i : sortedArr) {
            System.out.println(i);
        }

    }

    public static boolean isArraySorted(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
            }
        }
        return isSorted;
    }
    private static int[] bubbleSortArr(int[] arr) {
        if (isArraySorted(arr)) {
            System.out.println("Array Laready Sorted");
            return arr;
        }
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int i = 0; i < arr.length - 1 - turn; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
        }

        return arr;

    }
}
