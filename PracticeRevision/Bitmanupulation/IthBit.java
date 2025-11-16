package PracticeRevision.Bitmanupulation;

public class IthBit {
    public static void main(String[] args) {
        int n = 12;
        int i = 3;

        int bit = getIthBit(n, i);
        System.out.println("ith bit is " + bit);

        setIthBit(n, i);

    }

    private static void setIthBit(int n, int i) {

        int bitmask = 1 << i;
        n |= bitmask;

    }


    private static int getIthBit(int n, int i) {

        int bitmask = 1 << i;
        if ((n & bitmask) == 0)
            return 0;
        else
            return 1;

    }

}
