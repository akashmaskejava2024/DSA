package Basic.Interview_Practice;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4 };
        int[] arr2 = { 3, 5, 6 };

        mergeArrays(arr1, arr2);

    }

    private static void mergeArrays(int[] arr1, int[] arr2) {

        int[] newArr = new int[arr1.length + arr2.length];

        int count = 0;
        for(int i = 0; i<arr1.length; i++){
            newArr[count++] = arr1[i];
        }  
        for(int i = 0; i<arr2.length; i++){
            newArr[count++] = arr2[i];
        }        

        for(int i = 0; i<newArr.length; i++){
            for(int j = i+1; j<newArr.length; j++){
                if(newArr[i] > newArr[j] ){
                    int temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }


        for(int i= 0; i<newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}
