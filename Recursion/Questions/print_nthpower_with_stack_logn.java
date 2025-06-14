package Questions;

public class print_nthpower_with_stack_logn {

    public static int power(int x, int n) {

        if (n == 0)
            return 1;
        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return power(x, n / 2) * power(x, n / 2);
        } else {
            return power(x, n / 2) * power(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
     System.out.println(power(2, 2));;
    }

}
