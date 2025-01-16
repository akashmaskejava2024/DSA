package Basic.Interview_Practice;

public class removeDuplicate {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 4, 4 };

        removeDUplicate(arr);
    }

    private static void removeDUplicate(int[] array) {

        int[] arr = sortArray(array);


        int[] newArr = new int[arr.length];

        int count = 0;
        newArr[count] = arr[0];
        count++;

        for (int i = 1; i < arr.length-1; i++) {

            if(arr[i] != arr[i+1]){
                
                  newArr[count++] = arr[i];
                

            }
        }
        newArr[count++] = arr[arr.length -1];

        for(int i = 0; i<count; i++){
            System.out.print(newArr[i] + " ");
        }

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
