package Basic.Strings;

public class StringComparison {
    public static void main(String[] args) {
        String[] arr = { "apple", "Banana", "Jackfruit" };
        String largestStr = largestString(arr);
        System.out.println(largestStr);
    }
    private static String largestString(String[] arr) {
        String maxString = arr[0];
        for(int i = 1; i<arr.length; i++ ){
            if(arr[i].compareTo(arr[i-1]) > 0){
                maxString = arr[i];
            }
        }
        return maxString;
    }
}
