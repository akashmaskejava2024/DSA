package Patterns;

public class Rhombus {
    public static void main(String[] args) {
        printRhombus(4);
    }

    private static void printRhombus(int n) {
        int count = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + count; j++) {
                if (j <= count) {
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
