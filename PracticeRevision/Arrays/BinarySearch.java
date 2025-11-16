package PracticeRevision.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 5, 6, 6, 10 };

        int key = 6;

        int idx = find(arr, key);

        System.out.println(idx);
    }

    private static int find(int[] arr, int key) {

        int first = 0;
        int last = arr.length - 1;

       

        while (first <= last) {
            
            int mid = (first + last) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {

                first = mid + 1;

            } else if (arr[mid] > key) {
                last = mid -1;
            }

        }

        return -1;

    }
}
