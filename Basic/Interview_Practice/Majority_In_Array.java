package Basic.Interview_Practice;

public class Majority_In_Array {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,2,3,4,5,3,3,2,2,2,2};

        System.out.println(isMajorityPresent(arr));
            }
        
            private static boolean isMajorityPresent(int[] arr) {
                for(int i = 0; i<arr.length; i++){
                    if(arr[i] > arr.length/2){
                        return true;

                    }
                }
                return false;
            }
}
