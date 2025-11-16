package PracticeRevision.Sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = { 12, 32, 34, 11, 98, 87, 45, 23, 102 };

        bubbleSort(arr);

    }

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        for(int i = 0;i< arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }

    }
}
