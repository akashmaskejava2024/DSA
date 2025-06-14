package BasicRecursion;

public class FIndfirstOccurenceUsingRecursion {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 6, 5, 5 };

        int key = 5;
        System.out.println("fist occenrence of " + key + " is " + firstOccur(arr, key, 0));
    }

    public static int firstOccur(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == arr[key]) {
            return i;
        }
        return firstOccur(arr, key, i + 1);
    }
}
