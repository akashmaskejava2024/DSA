package PracticeRevision.Bitmanupulation;

public class DecimalToBinary {
    public static void main(String[] args) {

        int dec = 1223;

        String bin = convertToBinary(dec);
        System.out.println(bin);
    }

    private static String convertToBinary(int dec) {

        StringBuilder bin = new StringBuilder("");
        while (dec != 0) {
            int temp = dec % 2;
            bin.append(temp);
            dec /= 2;
        }

        return bin.toString();

    }
}
