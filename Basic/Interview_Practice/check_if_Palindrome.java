package Basic.Interview_Practice;

public class check_if_Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(checkPalindrome(str));
    }

    private static boolean checkPalindrome(String str) {

        String revStr = "";
        for(int i = str.length(); i>=0; i--){

            revStr+=str.charAt(i);
        }
        if(str.equalsIgnoreCase(revStr)){
            return true;
        } else {
            return false;
        }

    }
}
