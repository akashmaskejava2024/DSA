package BasicRecursion.AdvancedRecursionQuestion;

public class FriendsParingProblem {
    public static void main(String[] args) {

        int n = 3;

        int totalWays = waysToPresent(n);

        System.out.println(totalWays);
    }

    public static int waysToPresent(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        // single
        int single = waysToPresent(n - 1);
        // paired
        int paired = waysToPresent(n - 2);
        int totalPairedAndSingle = single * paired;
        int totalWays = single + totalPairedAndSingle;
        return totalWays;
    }
}
