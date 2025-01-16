package Basic.Interview_Practice;

public class Max_Product {
    public static void main(String[] args) {
        int[] arr = { 3, 5, -2, 8, -1 };
        findMaxMultiplication(arr);
    }

    private static void findMaxMultiplication(int[] arr) {

        int max = 0;
        int firstNo = 0;
        int secNo = 0;

        for(int i= 0;i<arr.length; i++){
            

            for(int j = i+1;j<arr.length; j++){

               if(arr[i] * arr[j] > max){

                max = arr[i] * arr[j];
                firstNo = arr[i];
              secNo = arr[j];

               }

            }


        }

        System.out.println(max + " ( " + firstNo + "* " + secNo +")");


    }
}
