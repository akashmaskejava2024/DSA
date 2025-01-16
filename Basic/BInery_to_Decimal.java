package Basic;
public class BInery_to_Decimal {
    public static void main(String[] args) {
        printBineryToDec(1111);
    }
    private static void printBineryToDec(int n) {
        int myNum = n;
        int pow = 0;
        int decNum = 0;
        while(n>0){
            int lastDigit = n % 10;
            decNum = decNum + (lastDigit     * (int) Math.pow(2, pow));
            pow++;
            n = n/10;
        }
        System.out.println(" The Binery from " + myNum + " to Decimal = " + decNum);
    }
}
