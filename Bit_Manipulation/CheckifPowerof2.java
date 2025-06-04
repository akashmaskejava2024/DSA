package Bit_Manipulation;

public class CheckifPowerof2 {
    public static void main(String[] args) {

        int n = 7;

        System.out.println(isPowerof2(n));
    }

    public static boolean isPowerof2(int n) {
        if ((n & (n-1) )== 0){
              return true;
        } else { 
             return false;
        }
    }
}
