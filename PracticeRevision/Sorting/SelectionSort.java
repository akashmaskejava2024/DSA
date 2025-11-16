package PracticeRevision.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 12, 32, 34, 11, 98, 87, 45, 23, 102 };

        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int smallest = i;
            for (int j = i; j < arr.length; j++) {

                if (arr[j] < smallest) {
                    smallest = j;
                }

            }

            // temp
            int temp = arr[i];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }

        for(int i = 0;i< arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }

    }
}
