package Bit_Manipulation;

public class UpadateIthBit {
    
    public static void main(String[] args) {
        int n = 10;
        System.out.println(upadateIthBit(n, 1, 1));
        
    }

    public static int upadateIthBit(int n , int i , int newBit){
        int bitMask = newBit << i; 
        // clear the bit 
        n = n & ~(1 << i);
        return n | bitMask;
    }
}
