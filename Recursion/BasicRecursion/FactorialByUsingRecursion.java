package BasicRecursion;

public class FactorialByUsingRecursion {
    public static void main(String[] args) {

        int n = 4;

        int factorial = calFactorial(n);
        System.out.println(factorial);
    }

    public static int calFactorial(int n) {
        if(n == 0){
            return 1; 
        }
        return n * calFactorial(n -1);
    }
}
