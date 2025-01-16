package Basic.Interview_Practice;


public class check_if_Anagrams {
    public static void main(String[] args) {

        String str1 = "silent";
        String str2 = "listen";

        boolean isAnagram = checkIfAnagrams(str1, str2);
        System.out.println(isAnagram);

    }

    private static boolean checkIfAnagrams(String str1, String str2) {

        char[] arr1 = sortArray(str1.toCharArray());
        char[] arr2 = sortArray(str2.toCharArray());

        if (str1.length() == str2.length()) {

            for(int i = 0; i<arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    return false;
                }

            }

            return true;

        } else {
            return false;
        }

    }

    private static char[] sortArray(char[] arr) {
          

        for(int i = 0; i<arr.length ; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){

                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;


    }
}
