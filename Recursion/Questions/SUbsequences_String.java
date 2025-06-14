package Questions;
import java.util.HashSet;

public class SUbsequences_String {
    public static void subsequences(String str, int index, String newStr, HashSet<String> set) {
        if (index == str.length()) {
            if(set.contains(newStr)){
                return;
            } else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(index);
        // to be in the new String
        subsequences(str, index + 1, newStr + currChar, set);
        // not to be in the new String
        subsequences(str, index + 1, newStr, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
}
