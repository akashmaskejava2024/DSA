package ArrayList;

public class PariSum1 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int target = 5;

        printPairSums(arr, target);

    }

    private static void printPairSums(int[] arr, int target) {

        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            if (arr[first] + arr[last] == target) {
                System.out.println("( " + arr[first] + " , " + arr[last] + " )");
            }
            if (arr[first] + arr[last] < target) {
                first++;
            } else {
                last--;
            }
        }
    }
}
