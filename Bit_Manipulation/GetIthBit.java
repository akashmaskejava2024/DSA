package Bit_Manipulation;

public class GetIthBit {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(DecimalToBinary.convertToBinary(n));
        System.out.println(BinaryToDecimal.convertToDecimalNo(DecimalToBinary.convertToBinary(n)));
        int bit = getIthbit(n, 2);
        System.out.println(bit);
        System.out.println(setIthBit(n, 1));
    }

    private static int getIthbit(int n, int i) {
        int bitmask = 1 <<i; 
        if((n & bitmask) == 0) return 0;
        else return 1;

    }

    private static int setIthBit(int n , int i){
        int bitmask = i << i; 
        return n | bitmask;
    }
}
