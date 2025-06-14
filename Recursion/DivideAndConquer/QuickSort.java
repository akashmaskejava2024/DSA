package DivideAndConquer;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = { 2, 6, 4, 7, 3, 8 };

        quickSort(arr, 0, arr.length - 1);
        for(int a : arr){
            System.out.print(a + " ");
        }
    }

    private static void quickSort(int[] arr, int si, int ei) {
        if (ei <= si) {
            return;
        }
        int pivotIdx = partition(arr, si, ei);
        quickSort(arr, si, pivotIdx -1 );
        quickSort(arr, pivotIdx + 1, ei);
    }

    private static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i= si -1; 
        for(int j = si; j < ei; j++){
            if( arr[j]  <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp =pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
}
