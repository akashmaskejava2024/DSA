import java.util.HashSet;

public class print_all_combinations_String {
    public static void printComnination(String str, int index, String newStr, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                permutations(newStr, "");
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(index);
        // to be in the newStr
        printComnination(str, index + 1, newStr + currChar, set);
        // to be not in the newStr
        printComnination(str, index + 1, newStr, set);
    }

    public static void permutations(String str, String permutations) {
        if (str.length() == 0) {
            System.out.println(permutations);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutations(newStr, permutations + currChar);
        }
    }
    
    public static void main(String[] args) {
        String str = "abc";
        HashSet<String> set = new HashSet<>();
        printComnination(str, 0, "", set);

    }
}
