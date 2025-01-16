package Basic.Interview_Practice;

public class nextSmallestPalindrome {

    public static void main(String[] args) {

        int n = 1232;

        System.out.println(nextSmallestPalindrom(n));

    }

    private static int nextSmallestPalindrom(int n) {

        int number = n + 1;
        while (number > n) {

            String str = Integer.valueOf(number).toString();
            String newStr = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                newStr += str.charAt(i);
            }
            if (str.equalsIgnoreCase(newStr)) {

                return Integer.parseInt(newStr);

            } else {
                number++;
            }

        }
        return 0;

    }

}
