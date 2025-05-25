package Basic.Patterns;

public class NUMBER_PYRAMID_pattern {
    public static void main(String[] args) {
        printNumPyramid(5);
    }
    private static void printNumPyramid(int n) {
        int count = n;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= count + num; j++) {

                if (j <= count) {
                    System.out.print(" ");
                } else {
                    System.out.print(num + " ");
                }
            }
            num++;
            count--;
            System.out.println();
        }
    }
}
