package Basic.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int pivotIndex = 4;
      

        arr = rotateArray(arr, pivotIndex);
        for(int i = 0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] rotateArray(int[] arr, int pivotIndex) {

        int newArr[] = new int[arr.length];

        int count = 0;
        for(int i = pivotIndex ; i<arr.length; i++){
            newArr[count++] = arr[i];
        }
        for(int i = 0; i<pivotIndex; i++){
            newArr[count++] = arr[i];
        }
        return newArr;

    }
}
