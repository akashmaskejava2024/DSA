package TImed_Practice;

import java.util.HashMap;
import java.util.Map;

public class Count_Chars_in_String {
    public static void main(String[] args) {
        String str = "akashmaske";

        findCharCount(str);

    }

    public static void findCharCount(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<str.length(); i++){

            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+ 1);

        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
