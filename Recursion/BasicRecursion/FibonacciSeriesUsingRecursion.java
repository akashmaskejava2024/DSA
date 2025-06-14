package BasicRecursion;

public class FibonacciSeriesUsingRecursion {
    public static void main(String[] args) {

        int n = 20;
        System.out.println(printFibonacciSeris(n));

    }

    public static int printFibonacciSeris(int n) {
        if(n == 1){
            return 1;
        } else if (n == 0){
            return 0; 
        }
        int f1 = printFibonacciSeris(n - 1 );
        int f2 = printFibonacciSeris(n - 2 );
        return f1 + f2;
    }
}
