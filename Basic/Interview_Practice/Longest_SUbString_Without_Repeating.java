package Basic.Interview_Practice;

public class Longest_SUbString_Without_Repeating {
    public static void main(String[] args) {

        String str = "akashmaske";

        printLongestSubstringWithoutRepeating(str);

    }

    private static void printLongestSubstringWithoutRepeating(String str) {

        str= removeDuplicate(str);

        String maxString = "";
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {

                
                if (max < str.substring(i, j+1).length()) {
                    max = str.substring(i, j+1).length();
                    maxString = str.substring(i, j+1);
                }

            }
        }


        System.out.println(maxString);

    }

    private static String removeDuplicate(String newStr) {

        char[] arr = newStr.toCharArray();

        String str = "";
        for(int i = 0; i<arr.length; i++){

            for(int j = i+1; j<arr.length; j++){

                if(arr[i] > arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                
                }

            }

        }
        str += arr[0];

        for(int i = 1; i<arr.length; i++){

            if(arr[i] != arr[i-1]){
                str += arr[i];
            }

        }

        return str;


    }
}
