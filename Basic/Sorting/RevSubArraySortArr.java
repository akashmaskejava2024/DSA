package Basic.Sorting;

public class RevSubArraySortArr {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 5, 4, 3 };
        int n = arr.length;

        if (checkReverse(arr, n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    private static boolean checkReverse(int[] arr, int n) {
        // boolean isSorted = false;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         reverse(arr, i, j);
        //         if(isSorted(arr)){
        //             return true; 
        //         }
        //         reverse(arr, i, j);
        //     }
        // }
        int l = 0; 
        while(l < n -1 && arr[l] <= arr[l+1]) l++;

        if(l == n-1) return true; 

        int r= n - 1; 
        while(r > 0 && arr[r] >= arr[r-1]) r--; 

        reverse(arr, l, r);
        return isSorted(arr); 
    }
    private static boolean isSorted(int[] arr) {
        for(int i = 0; i< arr.length -1 ; i++){
            if(arr[i] > arr[i+ 1]){
                return false; 
            }
        }
        return true; 
    }
    private static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
