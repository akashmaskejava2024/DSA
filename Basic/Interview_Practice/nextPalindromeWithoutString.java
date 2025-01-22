package Basic.Interview_Practice;

public class nextPalindromeWithoutString {
    public static void main(String[] args) {

        int n = 12341;

        nextPlindrome(n);

    }

    private static void nextPlindrome(int n) {
        int count = n + 1;
        while (count > n) {

            if (isPalindrome(count)) {

                System.out.println(count);
                break;

            } else {
                count++;
            }
        }
    }

    private static boolean isPalindrome(int count) {
        int org = count;
        int revCount = 0;
        while (count > 0) {
            int n = count % 10;
            revCount = revCount * 10 + n;
            count /= 10;
        }
        return org == revCount;
    }
}
