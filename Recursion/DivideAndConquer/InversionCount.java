package DivideAndConquer;

public class InversionCount {

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        // a[i] and a[j] form an inversion if a[i] > a[j] and i < j
        int invCount = inversionCount(arr);
        System.out.println(invCount);
    }

    public static int inversionCount(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static int mergeSort(int[] arr, int si, int ei) {
        int invCount = 0;
        if (si >= ei) {
            return invCount;
        }
        int mid = si + (ei - si) / 2;
        invCount = mergeSort(arr, si, mid);
        invCount += mergeSort(arr, mid + 1, ei);
        invCount += merge(arr, si, mid + 1, ei);
        return invCount;
    }
    private static int merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si; 
        int j = mid; 
        int k= 0; 
        int invCount = 0; 
        while(i < mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                 temp[k++] = arr[j++];
                 invCount += (mid - i); // All remaining elements in left half form inversions
                //  so we can say that right from the i to mid elements would be greater than arr[j] and as i < j because i is from si < i < mid and mid < j < ei  already i < j                
            }
        }
        while(i < mid){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        for(i = si, k = 0; k < temp.length ; k++, i++){
            arr[i] = temp[k];
        }
        return invCount;
    }
}