package PracticeRevision.Sorting;

public class SelectionSort1 {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 42, 4, 553, 3, 23, 23, 100 };

        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {

        int n = arr.length; 

        for(int i = 0; i< n  -1; i++){
            int curr = arr[i]; 
            int smallest = i;
            int j = i + 1; 
            while(arr[j] > curr  && j < n  - 1){
                j++;
            }
            smallest = j;
          

            int temp = arr[smallest]; 
            arr[smallest] = curr; 
            arr[i] = temp; 
        }


        for(int i : arr){
            System.out.println(i);
        }


    }
}
