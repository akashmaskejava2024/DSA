package Basic.Interview_Practice;

public class Count_Palindromic_SubStrings {
    public static void main(String[] args) {
        String str = "abasakafhalsdkjf";

        countPalindromicSubStrings(str);
    }

    private static void countPalindromicSubStrings(String str) {

        String[] arr = new String[256];

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {

                if (isPalindrome(str.substring(i, j + 1))) {

                    arr[count++] = str.substring(i, j + 1);

                }

            }
        }
        System.out.println("COunt is " + count);

        for(int i = 0; i<count; i++){
            System.out.print(arr[i]+ " ");

        }

    }

    private static boolean isPalindrome(String substring) {

        String str = "";
        for (int i = substring.length() - 1; i >= 0; i--) {
            str += substring.charAt(i);
        }
        if (str.equals(substring)) {
            return true;

        }
        return false;

    }
}
