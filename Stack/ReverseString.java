package Stack;

import java.util.Stack;

public class ReverseString {

    public String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            s.push(str.charAt(i));
            i++;
        }
        i = 0;
        StringBuilder sb = new StringBuilder("");
        while (i < str.length()) {
            sb.append(s.pop());
            i++;
        }
        str = sb.toString();
        return str;
    }

    public void reverse(){



    }

    public static void main(String[] args) {

    }
}
