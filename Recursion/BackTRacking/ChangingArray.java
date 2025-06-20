package BackTRacking;


public class ChangingArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0,1);
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void changeArr(int[] arr, int i, int val) {
        // base case 
        if(i == arr.length ) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val; 
        changeArr(arr,  i + 1, val + 1);
        arr[i] -= 2; 
    }
}
