package Stack;

import java.util.Stack;

import Basic.Interview_Practice.count_no_chars;

public class DuplicateParanthesis {
    public static void main(String[] args) {

        String str = "(a + (b)((a - b)))";

        System.out.println(isDuplicateParanthesis(str));

    }

    private static boolean isDuplicateParanthesis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if (c != ')') {
                s.push(c);
            } else {

                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                }else {
                    s.pop(); // opening pair pop
                }
            }
        }
        return false;
    }
}
