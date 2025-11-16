package PracticeRevision.Basic;

public class FInsDUplicatesinArry {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 3, 4, 5, 6, 2, 4 };

        boolean isPresent = findDuplicate(arr);
        System.out.println(isPresent);
    }

    private static boolean findDuplicate(int[] arr) {

        int[] sortedArr = sort(arr);

        for(int i = 1; i < arr.length ; i++){
            if(sortedArr[i] == sortedArr[i-1]){
                return true;
            }
        }

        return false;

    }

    private static int[] sort(int[] arr) {

        for(int i = 0; i< arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i]; 
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;

    }
}
