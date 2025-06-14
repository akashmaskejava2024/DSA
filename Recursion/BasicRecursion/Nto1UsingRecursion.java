package BasicRecursion;

public class Nto1UsingRecursion {
    public static void main(String[] args) {
        
        printN(10);

    }

    public static void printN(int n){
        System.out.println(n);
        if(n == 0){
            return;
        }
        printN(--n);
    }
}
