package Basic.Interview_Practice;

public class FInbonacci_Series_till_n {

    public static void main(String[] args) {

        int n = 10;
        printFibonacciSeries(n);

    }

    private static void printFibonacciSeries(int n) {

        int first = 0;
        int sec = 1;
        System.out.print(0 + " ");
        int sum = 0;
        for (int i = 2; i <= n; i++) {

            sum = first + sec;
            first = sec;
            sec = sum;
            System.out.print(sum + " ");

        }

    }
}
