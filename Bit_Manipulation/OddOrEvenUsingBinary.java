package Bit_Manipulation;

public class OddOrEvenUsingBinary {
    public static void main(String[] args) {

        int n = 11;
        oddOrEven(n);


        // if(binNo%10 == 0){
        //     System.out.println("Evene No. ");
        // } else {
        //     System.out.println("Odd no.");
        // }
    }


    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even No.");
        } else {
            System.out.println("Odd no.");
        }
    }

    private static int convertToBinary(int n) {
        int binNo = 0;
        int count = 1;
        while (n != 0) {
            int remainder = n % 2;
            binNo += remainder *= count;
            count *= 10;
            n /= 2;
        }
        return binNo;
    }
}
