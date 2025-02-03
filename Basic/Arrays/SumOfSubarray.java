package Basic.Arrays;

public class SumOfSubarray {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 55, 5 };
        int sum = 7;
        printSubArrayWithSum(arr, sum);
        

    }

    private static void printSubArrayWithSum(int[] arr, int target) {

        int sum = 0;
        for(int i = 0;i<arr.length; i++){
            for(int j = i + 1; j<arr.length; j++){

                for(int k = i; k<=j; k++){

                    sum += arr[k];

                } 
                if(target == sum){
                    System.out.print("[ ");
                    for(int k = i; k<=j; k++){
                        System.out.print( arr[k]+ ",");
                    }
                    System.out.print("]");
                    System.out.println();
                     
                }
                sum = 0;

            }
        }


    }
}
