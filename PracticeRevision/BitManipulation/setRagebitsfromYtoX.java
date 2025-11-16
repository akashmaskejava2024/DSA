package PracticeRevision.BitManipulation;

public class setRagebitsfromYtoX {
    public static void main(String[] args) {

        System.out.println(setSetBit(43, 3, 1, 5));

        
    }

    static int setSetBit(int X, int Y, int L, int R) {
        // Number of bits in the range
        int rangeLen = R - L + 1;

        // Step 1: Extract bits from Y in range [L, R] shifted down to zero position
        int bitsFromY = (Y >> (L - 1)) & ((1 << rangeLen) - 1);

        // Step 2: Create mask to clear bits in X in the range [L, R]
        int mask = ((1 << rangeLen) - 1) << (L - 1);

        // Step 3: Clear bits in X in the range
        X = X & (~mask);

        // Step 4: Set bitsFromY back to the correct position and combine with X
        X = X | (bitsFromY << (L - 1));

        return X;
    }
}
