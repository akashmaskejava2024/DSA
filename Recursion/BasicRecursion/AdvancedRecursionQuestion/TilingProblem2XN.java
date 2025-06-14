package BasicRecursion.AdvancedRecursionQuestion;

public class TilingProblem2XN {

    public static void main(String[] args) {

        // the floar is of 2 X 3

        int n = 4; 
        System.out.println(calTiles(n));
    }

    public static int calTiles(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int vertical = calTiles(n - 1);
        int horizontal = calTiles(n - 2);
        return vertical + horizontal;
    }
}
