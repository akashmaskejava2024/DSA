package Basic.Arrays;

public class FindIndexOfTargetInArray {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 0;
        System.out.println(indexOfTarget(arr, target));
    }

    private static int indexOfTarget(int[] arr, int target) {

        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {

            int mid = (first + last) / 2;
            if (target < arr[mid]) {
                last = mid - 1;
            } else if (target > arr[mid]) {
                first = mid + 1;
            } else {
                return first;
            }
        }
        return -1;

    }
}
