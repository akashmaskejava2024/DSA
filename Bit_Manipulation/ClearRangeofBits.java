package Bit_Manipulation;


public class ClearRangeofBits {
    public static void main(String[] args) {
        int n  = 10; 
        int i  = 2; 
        int j = 7; 
        int bn = ClearRangeofBits.clearRangeOfBits(n, i, j);
        System.out.println(bn);
    }
    public static int clearRangeOfBits(int n, int i , int j){
        int a = (~0) << (j + 1);
        int b = (1 << i)  - 1 ;
        int bitmask  = a | b;
        return n & bitmask;
    }
}
