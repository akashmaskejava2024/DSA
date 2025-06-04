package Bit_Manipulation;

public class CountSetBits {
    public static void main(String[] args) {

        System.out.println(countSetBits(3));

    }

    public static int countSetBits(int n) {
        int count = 0; 
        while (n != 0) {
            count += n & 1; 
            n = n >> 1;
        }
        return count;
    }
}
