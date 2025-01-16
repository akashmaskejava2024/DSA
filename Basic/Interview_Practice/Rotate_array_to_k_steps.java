package Basic.Interview_Practice;

public class Rotate_array_to_k_steps {

    public static void main(String[] args) {

        int steps = 3;
        int[] arr = { 1, 2, 3, 4, 5 };
        rotateArrayBySteps(arr, steps);

    }

    private static void rotateArrayBySteps(int[] arr, int steps) {
        int[] newArr = new int[arr.length];

        int count = 0;
        for (int i = arr.length - steps; i < arr.length; i++) {
            newArr[count] = arr[i];
            count++;
        }

        for (int i = 0; i < arr.length - steps; i++) {
            newArr[count] = arr[i];
            count++;
        }
        System.out.print("{ ");
        for (int i = 0; i < newArr.length; i++) {

            System.out.print(newArr[i] + " ");
        }

        System.out.print(" }");

    }
}
