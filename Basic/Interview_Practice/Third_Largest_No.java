package Basic.Interview_Practice;

public class Third_Largest_No {

    public static void main(String[] args) {

        int[] arr = { 12, 45, 7, 89, 21 };
        print3rdLrgest(arr);
    }

    private static void print3rdLrgest(int[] arr) {

        for(int i = 0; i<arr.length; i++){
            for(int j = i + 1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("3rd largest = "  + arr[2]);
    }
}
