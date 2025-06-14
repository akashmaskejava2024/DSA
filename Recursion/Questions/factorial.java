package Questions;


import java.util.Scanner;

public class factorial {
     public static int fact(int no) {
        if (no == 1 || no == 0) {
            return 1;
        }
        int fact = no * fact(no - 1);
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. till sum ");
        int no = sc.nextInt();
        System.out.println("sum is " + fact(no));
        sc.close();
    }
}
