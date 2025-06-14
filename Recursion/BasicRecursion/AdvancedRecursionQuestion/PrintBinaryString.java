package BasicRecursion.AdvancedRecursionQuestion;

public class PrintBinaryString {

    public static void main(String[] args) {

        int n = 3;

        printBinaryStirngtillN(n, 0, "");

    }

    private static void printBinaryStirngtillN(int n, int lastPlace, String str) {
        // print n binary String with no consicutive 1's
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinaryStirngtillN(n - 1, 0, str + "0");
        // 0 selected 
        if (lastPlace == 0) {
            printBinaryStirngtillN(n - 1, 1, str + "1");
        }
    }
}