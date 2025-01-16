package Basic;

public class check_prime {

    public static void main(String[] args) {

        checkPrime(11);
    }

    private static void checkPrime(int n) {

        for (int i = 2; i < n; i++) {

            if (i < n) {
                if (n % i == 0) {
                    System.out.println("Not Prime");
                    return;
                }
            }

            if (i == n - 1) {
                System.out.println("Prime");
                return;
            }
        }

    }
}
