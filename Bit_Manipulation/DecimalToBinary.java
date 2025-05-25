package Bit_Manipulation;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decNo = 4;
        int bin = convertToBinary(decNo);
        System.out.println(bin);
    }

    public static int convertToBinary(int decNo) {
        int bin = 0; 
        int count = 1;
        while(decNo != 0){
            int remainder = decNo % 2;
            remainder *= count;
            count *= 10;
            bin += remainder;
            decNo /= 2;
        }
        return bin;
    }
}
