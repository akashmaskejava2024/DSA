package DivideAndConquer;

public class SearchInSortedAndRotatedArray {
    public static void main(String[] args) {

        int[] arr = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int tar = 5;

        int index = search(arr, tar, 0, arr.length - 1);
        System.out.println(index);

    }

    public static int search(int[] arr, int tar, int si, int ei) {
        // base case 
        if( si > ei){
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            return mid;
        }
        // if on L1
        if (arr[si] <= arr[mid]) {
            // case a : tar is on left on L1
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // case a : tar is on right
                return search(arr, tar, mid + 1, ei);
            }
        }
        // if on L2
        else {
            // case c: on l2 on right
            if(tar >= arr[mid] && tar <= arr[ei]){
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid -1);
            }
        }
    }
}
