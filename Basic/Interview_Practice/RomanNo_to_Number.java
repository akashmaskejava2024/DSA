package Basic.Interview_Practice;

import java.util.HashMap;

public class RomanNo_to_Number {
    public static void main(String[] args) {

        String romanNo = "XIX";

        findNoByRomanNo(romanNo);

    }

    private static void findNoByRomanNo(String romanNo) {

        // I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000.

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(romanNo.charAt(0));
        for (int i = 1; i < romanNo.length(); i++) {
            if (map.get(romanNo.charAt(i - 1)) < map.get(romanNo.charAt(i))) {
                result += (map.get(romanNo.charAt(i)) - 2 * map.get(romanNo.charAt(i - 1)));

            } else {
                result += map.get(romanNo.charAt(i));

            }

        }
        System.out.println(result);

    }
}
