package BasicRecursion;

public class LastOccurenceUsingRecursion {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 6, 5, 5,3,5,6,2 };

        int key = 3;

        System.out.println("Last occenrence of " + key + " is " + lastOccur(arr, key, arr.length - 1));
    }

    public static int lastOccur(int[] arr, int key, int i) {
        if(i == 0){
            return -1; 
        }
        if(arr[i] == key){
            return i;
        }
       return lastOccur(arr, key, --i);
    }
}
