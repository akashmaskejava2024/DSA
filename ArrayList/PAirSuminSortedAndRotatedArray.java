package ArrayList;

public class PAirSuminSortedAndRotatedArray {
    public static void main(String[] args) {
        int[] arr = { 11, 14, 6, 7, 8, 9, 10 };
        int target = 16;
        printPairsSum(arr, target);
    }

    private static void printPairsSum(int[] arr, int target) {
        int pivotIdx = findPivotIndex(arr);
        int last = pivotIdx;
        int first = pivotIdx + 1;
        while (first != last) {
            if (arr[first] + arr[last] == target) {
                System.out.println("( " + arr[first] + " , " + arr[last] + " )");
            }
            if (arr[first] + arr[last] < target) {
                first = (first + 1) % arr.length;
            } else {
                last = (arr.length + last - 1) % arr.length;
            }
        }
    }

    private static int findPivotIndex(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return arr.length - 1;
        // if not rotated return last index
    }
}
