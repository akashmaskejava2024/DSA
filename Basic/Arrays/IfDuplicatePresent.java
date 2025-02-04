package Basic.Arrays;

public class IfDuplicatePresent {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 1 };

        System.out.println(isDuplicatePresent(arr));
    }

    private static boolean isDuplicatePresent(int[] arr) {

        // sorting the array
        for(int i = 0;i<arr.length ;i++){
            for(int j = i+1; j<arr.length; j++){

                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }

        for(int i =1; i<arr.length; i++){
            if(arr[i] == arr[i-1] ){
                return true;
            }
        }

        return false;

    }
}
