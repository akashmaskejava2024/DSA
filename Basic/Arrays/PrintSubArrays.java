package Basic.Arrays;

public class PrintSubArrays {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };

        printSubArrrays(arr);
    }

    private static void printSubArrrays(int[] arr) {


        for(int i = 0;i<arr.length; i++ ){

            for(int  j = i+1; j<arr.length; j++){
                System.out.print("[ ");
                for(int k = i; k<=j; k++){
                    System.out.print( arr[k]+ ",");
                }
                System.out.print("]");
                System.out.println();

            }
        }



    }
}
