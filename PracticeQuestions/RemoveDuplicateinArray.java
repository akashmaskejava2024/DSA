package PracticeQuestions;


public class RemoveDuplicateinArray {

    public static void main(String[] args) {

        int[] arr = { 12, 4, 2, 1, 12, 4, 45, 553, 1, 12 };

        int[] sortedArr = sortArray(arr);

        

        int[] duplicateRemovedArr = removeDuplicate(sortedArr);
        for (int a : duplicateRemovedArr) {
            System.out.print(a + " ");
        }
    }

    private static int[] removeDuplicate(int[] sortedArr) {

        int[] newArr = new int[sortedArr.length];
        newArr[0] = sortedArr[0];
        int count = 1;

        for(int i = 1 ;i< sortedArr.length; i++ ){

            if(sortedArr[i] != sortedArr[i - 1]){
                newArr[count] = sortedArr[i];
                count++;
            }
        }

        return newArr;
    }

    private static int[] sortArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        return arr;

    }
}
