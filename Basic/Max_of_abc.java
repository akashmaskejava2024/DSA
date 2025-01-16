package Basic;
public class Max_of_abc {
    public static int printMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(printMax(10, 15, 20));
    }
}
