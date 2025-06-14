package DivideAndConquer;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = { 2, 4, 2, 3, 7, 1, 3 };

        mergeSort(arr, 0, arr.length - 1);

    }

    private static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }
    private static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si; 
        int j = mid + 1; 
        int k = 0; 
        while( i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            } else{
                temp[k++] = arr[j++];
            }
        }
        // add the remaining on left side
        while(i  <= mid){
            temp[k++] = arr[i++];
        }
                // add the remaining on right side
        while(j <= ei){ 
            temp[k++] = arr[j++];
        }
        for(k = 0 , i = si; k < temp.length;k++ ,i++){
            arr[i] = temp[k];
        }
    }
}
