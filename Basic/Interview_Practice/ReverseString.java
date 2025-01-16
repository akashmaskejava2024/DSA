package Basic.Interview_Practice;

import java.util.HashMap;
import java.util.Map;

public class ReverseString {

    public static void main(String[] args) {

        String str = "pineapple";
        String revStr = reverse(str);
        System.out.println(revStr);
        printFreqOfChar(revStr);

    }

    private static void printFreqOfChar(String revStr) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put(revStr.charAt(0), 1);

        for (int i = 1; i < revStr.length(); i++) {

            Character ch = revStr.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        System.out.print("{ ");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + "  ");
        }
        System.out.print("}");
    }

    private static String reverse(String str) {
        // char[] arr = str.toCharArray();

        // int last = arr.length-1;
        // String revStr = "";

        // for(int i = 0; i<=arr.length/2; i++){
        // char temp = arr[i];
        // arr[i] = arr[last];
        // arr[last] = temp;
        // last--;

        // }
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        return revStr;
    }
}