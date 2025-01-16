package Basic;

public class Sum_n_natural {

    public static void main(String[] args) {
        printSum(4);
    }

    private static void printSum(int n) {
        
        // System.out.println(n * (n+1) / 2);

        int sum = 0;
        int i = 1;
        while (i <=n) {
            sum += i;
            i++;
            
        }
        System.out.println(sum);
    }
}
