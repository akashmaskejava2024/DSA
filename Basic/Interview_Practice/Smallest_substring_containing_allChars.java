package Basic.Interview_Practice;

import java.util.HashMap;
import java.util.Map;

public class Smallest_substring_containing_allChars {
    public static void main(String[] args) {
        String str = "askdhflaksfhiubrl";
        char[] arr = { 'a', 's', 'd', 'h' };
        smallestSubstringContainingAllChars(str, arr);
    }

    private static void smallestSubstringContainingAllChars(String str, char[] arr) {

        int smallest = str.length();
        String smallestString = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {

                if (checkIfAllCharsContainInStr(str.substring(i, j + 1), arr)) {

                    if (str.substring(i, j + 1).length() < smallest) {
                        smallest = str.substring(i, j + 1).length();
                        smallestString = str.substring(i, j + 1);
                    }

                }

            }
        }

        System.out.println(smallestString);

    }

    private static boolean checkIfAllCharsContainInStr(String substring, char[] arr) {

        HashMap<Character, Boolean> map = new HashMap<>();

        for(char c: arr){
            map.put(c, false);
        }
        for (int i = 0; i < arr.length; i++) {
            if (stringContains(substring, arr[i])) {
                map.put(arr[i], true);

            }

        }

        for (Map.Entry<Character, Boolean> entry : map.entrySet()) {

            if (entry.getValue() == false) {
                return false;
            }
        }

        return true;

    }

    private static boolean stringContains(String substring, char c) {

        boolean isCOntains = false;
        for (int i = 0; i < substring.length(); i++) {
            if (substring.charAt(i) == c) {
                isCOntains = true;
            }

        }

        return isCOntains;
    }
}
