package Basic.Interview_Practice;

import java.util.HashMap;
import java.util.Map;

public class count_no_chars {

    public static void main(String[] args) {

        String str = "apple";
        printNoofChars(str);
    }

    private static void printNoofChars(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        System.out.print("{ ");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + "  ");
        }
        System.out.print("}");
    }
}
