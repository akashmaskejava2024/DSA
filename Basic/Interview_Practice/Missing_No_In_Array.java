package Basic.Interview_Practice;

public class Missing_No_In_Array {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 7 };

        findMissingNo(arr);

    }

    private static void findMissingNo(int[] arr) {

        int diff = arr[1] - arr[0];
        int missingNo = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] - arr[i] != diff) {
                missingNo = arr[i] + diff;

            }

        }

        System.out.println(missingNo);

    }
}
