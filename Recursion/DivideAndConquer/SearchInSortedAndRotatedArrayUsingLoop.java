package DivideAndConquer;

public class SearchInSortedAndRotatedArrayUsingLoop {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int tar = 5;
        int index = search(arr, tar, 0, arr.length - 1);
        System.out.println(index);
    }

    private static int search(int[] arr, int tar, int si, int ei) {
        while( ei >= si){
            int mid = si + ( ei - si )/ 2;
            if(arr[mid] == tar){
                return mid;
            }
            // on L1
            if( arr[si] <= arr[mid]){
                if(arr[si] <= tar && tar <= arr[mid ]){
                    ei = mid -1;
                } else {
                    si = mid + 1;
                }
            }else{
                if(arr[mid  ] <= tar &&  tar <= arr[ei]){
                    si = mid + 1; 
                } else {
                     ei = mid - 1; 
                }
            }
        }
        return -1; 
        // base case if no index found
    }
}
