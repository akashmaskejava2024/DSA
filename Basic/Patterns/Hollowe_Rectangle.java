package Basic.Patterns;
public class Hollowe_Rectangle {
    public static void main(String[] args) {
        int l = 5;
        int b = 4;
        printHollowRect(l, b);
    }
    private static void printHollowRect(int l, int b) {
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= l; j++) {
                if (i > 1 && i < b) {
                    if (j == 1 || j == l) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
