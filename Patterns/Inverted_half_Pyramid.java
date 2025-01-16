package Patterns;
public class Inverted_half_Pyramid {
    public static void main(String[] args) {
        printInvertedhalfPramid(4);
    }
    private static void printInvertedhalfPramid(int n) {
        int count = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < count) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            count--;
            System.out.println();
        }
    }
}
