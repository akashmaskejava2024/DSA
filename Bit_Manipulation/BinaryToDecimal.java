package Bit_Manipulation;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int binNo = 1010;
        int decNo = convertToDecimalNo(binNo);
        System.out.println(decNo);
    }

    public static int convertToDecimalNo(int binNo) {
        int power = 0;
        int decNo = 0;
        while (binNo != 0) {
            int remainder = binNo % 10;
            // for (int i = 0; i < power; i++) {
            //     remainder *= 2;
            // }
            remainder *= Math.pow(2, power);
            power++;
            decNo += remainder;
            binNo /= 10;
        }
        return decNo;
    }
}
