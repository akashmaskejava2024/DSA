package Basic.Interview_Practice;

public class Alphabet_Pyramid {
    public static void main(String[] args) {


        int n = 5;
        printAphabetPyamid(n);

    }

    private static void printAphabetPyamid(int n) {

        int spaces = n - 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < count; j++) {

                System.out.print((char) ('A' + j) + " ");
            }
            if (count > 0) {

                for (int j = count - 2; j >= 0; j--) {

                    System.out.print((char) ('A' + j) + " ");
                }

            }
            System.out.println();

            spaces--;
            count++;
        }

    }
}
