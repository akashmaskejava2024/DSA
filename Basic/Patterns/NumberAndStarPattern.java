package Basic.Patterns;

public class NumberAndStarPattern {
    public static void main(String[] args) {

        int n = 5;
        printPattern(n);

    }

    private static void printPattern(int n) {

        int count = 1;
        int digitlength = n;
        for (int i = 1; i<=n; i++) {

            for (int j = 0; j < digitlength; j++) {

                if (i % 2 != 0) {
                    System.out.print(count++ + " ");
                } else {
                    System.out.print("* ");
                }

            }
            digitlength--;
            System.out.println();

        }

    }
}
