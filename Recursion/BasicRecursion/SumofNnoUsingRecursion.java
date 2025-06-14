package BasicRecursion;

public class SumofNnoUsingRecursion {
    public static void main(String[] args) {

        int n = 10;
        int sum = calSum(n);
        System.out.println(sum);
    }

    public static int calSum(int n) {
        if(n == 1){
            return 1;
        }
        return n + calSum(--n );
    }
}
