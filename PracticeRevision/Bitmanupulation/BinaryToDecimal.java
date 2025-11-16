package PracticeRevision.Bitmanupulation;

import javax.swing.plaf.metal.MetalTheme;

public class BinaryToDecimal {

    public static void main(String[] args) {

        int bin = 1101;
        int dec = convertToDecimal(bin);
        System.out.println(dec);
    }

    private static int convertToDecimal(int bin) {
        int dec = 0;
        int power = 0;
        while (bin != 0) {
            int temp = (int) Math.pow(2, power++) * (bin % 10);
            dec += temp;
            bin /= 10;
        }
        return dec;
    }

}
