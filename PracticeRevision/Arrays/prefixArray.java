package PracticeRevision.Arrays;


public class prefixArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int maxSum = findMaxSum(arr);

        System.out.println(maxSum);
    }

    private static int findMaxSum(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {

            prefix[i] = prefix[i - 1] + arr[i];

        }

        for (int i = 0; i < prefix.length; i++) {

            for (int j = i + 1; j < prefix.length; j++) {
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }

        }
        return maxSum;

    }
}
