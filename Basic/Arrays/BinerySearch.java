package Basic.Arrays;

public class BinerySearch {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
        int key = 7;
        int index = findIndexofKey(key, arr);
        System.out.println(index);
    }

    private static int findIndexofKey(int key, int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1; 

    }

}
