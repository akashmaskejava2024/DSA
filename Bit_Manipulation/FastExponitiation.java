package Bit_Manipulation;

public class FastExponitiation {
    public static void main(String[] args) {

        int base = 5;
        int pow = 4;

        System.out.println(fastExponitiation(base, pow));

    }

    public static int fastExponitiation(int base, int pow) {
        int ans = 1;
        // work accoridng to the bits of the pow.
        while (pow > 0) {
            if((pow & 1) != 0){
                ans = ans * base;
            }
            base *= base;
            pow = pow >> 1;
        }
        return ans;
    }
}
