package PracticeRevision.Basic;

public class fibonacciSerie {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        int c = a + b;

        printFibonacci(10);

    }

    private static void printFibonacci(int n) {

        int a = 0; 
        int b = 1; 

        System.out.print(0 + " " + 1 + " ");

        for(int i = 2; i<= n; i++ ){
            int c = a + b;
            System.out.print(c + " ");
            a = b; 
            b = c;
        }

        

    }

}
