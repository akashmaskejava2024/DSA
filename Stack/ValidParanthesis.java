package Stack;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String str = "{[()]}";

        System.out.println(isValid(str));
    }

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                s.push(c);
            } else {
                // means no opening brackets added to the sstack only closing stacks are there
                if (s.isEmpty()) {
                    return false;
                }

                if ((s.peek() == '(' && c == ')') || (s.peek() == '{' && c == '}') || (s.peek() == '[' && c == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
          if(s.isEmpty()){
            return true;
          } else{
            return false;
            // means some opeing brackets are there in the stack which are unsatisfied 
          }
    }
}
