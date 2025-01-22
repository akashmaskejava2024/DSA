package Basic.Interview_Practice;

import java.util.HashMap;
import java.util.Map;

public class Lexicographical_Word_Frequency {
    public static void main(String[] args) {
        String input = "the quick brown fox jumps over the lazy dog the dog jumps";

        printInLexicographicalOrder(input);
    }

    private static void printInLexicographicalOrder(String input) {

        HashMap<String, Integer> map = convertStringtoMap(input);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

    private static HashMap<String, Integer> convertStringtoMap(String input) {

        Map<String, Integer> map = new HashMap<>();

        // for (int i = 0; i < input.length(); i++) {
        //     if (input.charAt(i) != ' ') {
        //         newStr += input.charAt(i);
        //     } else {

        //         map.put(newStr, map.getOrDefault(newStr, 0) + 1);
        //         newStr = "";

        //     }

        //     if (i == input.length() - 1) {
        //         newStr += input.charAt(i);
        //         map.put(newStr, map.getOrDefault(newStr, 0) + 1);
        //         break;

        //     }

        // }
        // Convert input to lowercase for uniformity
        String[] words = input.toLowerCase().split("\\s+"); // Split by spaces or multiple spaces

        for (String word : words) {
            // Remove punctuation and trailing characters
            word = word.replaceAll("[^a-z]", ""); // Retain only alphabetic characters
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }


        return (HashMap<String, Integer>) map;

    }
}
