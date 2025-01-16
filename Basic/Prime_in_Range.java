package Basic;
public class Prime_in_Range {
    public static void main(String[] args) {
        primesInRange(1, 100);
    }
    private static void primesInRange(int min, int max) {
        if (!(min % 2 == 0)) {
            for (int i = min; i <= max; i = i + 2) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = min+1; i <= max; i = i + 2) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
