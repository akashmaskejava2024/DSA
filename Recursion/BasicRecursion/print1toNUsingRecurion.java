package BasicRecursion;

public class print1toNUsingRecurion {
    public static void main(String[] args) {
        
        printN(10);

    }


    public static void printN(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        printN(n - 1);
        System.out.println(n);
    }
}
