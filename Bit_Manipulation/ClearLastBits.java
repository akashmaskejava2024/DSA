package Bit_Manipulation;

public class ClearLastBits {
    public static void main(String[] args) {

        int n = 10;
        int i = 2;

        // clear the last i bits
        int clearedBits = clearLastBits(n, i);
        System.out.println(clearedBits); 
    }

    private static int clearLastBits(int n, int i) {
        int bits  = ~0;
        int bitmask = bits << i; 
        return n & bitmask;
    }
    
}
