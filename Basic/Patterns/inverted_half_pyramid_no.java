package Basic.Patterns;

public class inverted_half_pyramid_no {
    public static void main(String[] args) {
        printPyramid(5);
    }
    private static void printPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
