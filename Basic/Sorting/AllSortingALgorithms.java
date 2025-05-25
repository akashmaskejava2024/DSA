package Basic.Sorting;


public class AllSortingALgorithms {
    public static void main(String[] args) {

        int[] arr = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        int[] newArr = CountingSort(arr);

        printArray(newArr);

    }

    private static int[] CountingSort(int[] arr) {

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int[] count = new int[largest +1];
        for(int i = 0 ; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j = 0; 
        for(int i = 0; i < count.length; i++){

            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;   
            }
        }
        return arr;
    }

    private static int[] InsertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion logic
            arr[prev + 1] = curr;

        }

        return arr;

    }

    private static int[] SelectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;

                }

            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }

        return arr;

    }

    public static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.println(a);
        }
    }

    private static int[] bubbleSort(int[] arr) {

        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }
        return arr;

    }
}
