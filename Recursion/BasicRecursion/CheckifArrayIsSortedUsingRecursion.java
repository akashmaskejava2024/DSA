package BasicRecursion;

public class CheckifArrayIsSortedUsingRecursion {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3,6,5, 5 };
        System.out.println(checkIfSorted(arr, 1));
    }

    public static boolean checkIfSorted(int[] arr, int i) {
        if(i == arr.length - 1){
            return true;
        } 
        if(arr[i] > arr[i + 1]){
           return false;
        } 
        return checkIfSorted(arr, i+1);
    }
}
