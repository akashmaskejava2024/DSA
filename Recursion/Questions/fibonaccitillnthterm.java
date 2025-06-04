
public class fibonaccitillnthterm {
    public static void fib(int a, int b, int n){
        if(n == 0){
            return;
        }
      int c = a +b;
        System.out.print(c + " ");
        fib(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print("0 ");
        int n= 20;
        // becasue two terms already printed
       fib( a,  b, n-2);
    }
}
