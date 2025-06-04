package Bit_Manipulation;

public class SwapNoWithoutUsingVariable {
    public static void main(String[] args) {

        int a = 10;
        int b = 11;

        swapNo(a, b);
    }

    public static void swapNo(int a, int b) {
        System.out.println("Before Swap a = " + a + " and b = " + b);
        a = a ^ b; 
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap: a = "+a+" and b = "+b);
    }
}
