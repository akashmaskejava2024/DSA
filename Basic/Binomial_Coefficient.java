package Basic;

public class Binomial_Coefficient {
    public static void main(String[] args) {
        System.out.println(findBinomialCoefficient(5, 2));
    }
    private static int findBinomialCoefficient(int n, int r) {
        int nfact = factorial(n);
        int rfact = factorial(r);
        int n_rfact = factorial(n - r);
        return nfact / rfact / n_rfact;
    }
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
