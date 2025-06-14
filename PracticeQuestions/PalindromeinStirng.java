package PracticeQuestions;

public class PalindromeinStirng {
    public static void main(String[] args) {

        String str = "boby";

        int first = 0;
        int last = str.length() - 1;

        boolean isPalindrome = true;

        while (first <= last) {
            if (str.charAt(last--) != str.charAt(first++)) {
                isPalindrome = false;
            }
           
        }

        System.out.println(isPalindrome);

    }
}
