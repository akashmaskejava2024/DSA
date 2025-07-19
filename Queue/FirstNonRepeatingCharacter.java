package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aabccxb";

        firstNonRepeatingChar(str);

    }

    public static void firstNonRepeatingChar(String str) {
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (freq[q.peek() - 'a'] > 1 && !q.isEmpty()) {
                q.remove();
            }
            // if queue is emtpy then Akash it means that there non repeating chars.
            // else if they are not getting 
            if (q.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.println(q.peek() + " ");
            }

        }

    }
}
