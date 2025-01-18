package Basic.Interview_Practice;

public class Maximize_Sum_of_2_Arrays {

    public static void main(String[] args) {

        int[] arr1 = { 4, 6, 2, 3 };
        int[] arr2 = { 3, 4, 2, 5 };

        MaximumSumOfTwoArrays(arr1, arr2);

    }

    private static void MaximumSumOfTwoArrays(int[] arr1, int[] arr2) {

        int[] sortedArr1 = sortArray(arr1);
        int[] sortArray2 = sortArray(arr2);

        int count1 = sortedArr1.length - 1;
       
        int count2 = sortArray2.length - 1;
        int sum = 0;

        System.out.print("(");
        while (count1 >= 0 && count2 >= 0) {

            sum += (sortedArr1[count1] * sortArray2[count2]);
            System.out.print(sortedArr1[count1] + " * " + sortArray2[count2] + " + ");

            count1--;
            count2--;

        }
        System.out.print(" = " + sum + ")");

    }

    private static int[] sortArray(int[] arr1) {

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        return arr1;
    }
}