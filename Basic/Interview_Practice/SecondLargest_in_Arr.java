package Basic.Interview_Practice;

public class SecondLargest_in_Arr {

    public static void main(String[] args) {
        int[] arr = { 12, 45, 23, 67, 34, 89, 67 };

        int secLargest = findSecondLarg(arr);
        System.out.println(secLargest);

    }

    private static int findSecondLarg(int[] arr) {

        int max = arr[0];
        int secMax = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > secMax) {

                if (arr[i] > max) {
                    max = arr[i];

                } else {
                    secMax = arr[i];

                }

            } else {
                continue;
            }

        }
        return secMax;
    }
}
