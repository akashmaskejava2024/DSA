package Basic.Patterns;

public class Zero_1_Triangle_Pattern {

    public static void main(String[] args) {

        printTriangle(5);
    }

    private static void printTriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                if (count == 0) {
                    count = 1;
                } else {
                    count = 0;
                }
            }
            if (i % 2 == 0) {
                count = 1;
            } else {
                count = 0;
            }
            System.out.println();
        }

    }

}