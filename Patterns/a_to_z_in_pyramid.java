package Patterns;
public class a_to_z_in_pyramid {
    public static void main(String[] args) {
        char a = 'A';
        printAlphabetPyramid(4, a);
    }
    private static void printAlphabetPyramid(int n, char a) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
