package Basic.Interview_Practice;

import java.util.HashMap;
import java.util.Map;

public class Longest_Word {
    public static void main(String[] args) {

        String str = "I am learning Java programming";
        System.out.println(printLogestWord(str));
    }

    private static String printLogestWord(String str) {

        HashMap<String, Integer> map = new HashMap<>();

        String word = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
                count++;
            }
            if (i == str.length() - 1 || str.charAt(i) == ' ') {
                map.put(word, count);
                word = "";
                count = 0;
            }
        }

        
        String longest_Word = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                longest_Word = entry.getKey();
            }

        }

        return longest_Word;

    }
}
