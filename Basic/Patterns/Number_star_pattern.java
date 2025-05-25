package Basic.Patterns;

public class Number_star_pattern {
    public static void main(String[] args) {
        int n = 22;

        printNoAndStar(n);
    }

    private static void printNoAndStar(int n) {

        int count = 1;
        int last = 10;
        while (count <= n) {

            while (count <= last) {

                if (count <= last - 5) {
                    System.out.print(count);
                    if (count == n) {
                        break;
                    }
                    count++;
                } else {
                    System.out.print("*");
                    if (count == n) {
                        break;
                    }
                    count++;

                }

            }
            System.out.println();
            if (count == n) {
                break;
            }
            last += 10;
        }
    }
}
