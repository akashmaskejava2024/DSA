package Greedy_ALgorithm;

import java.util.Arrays;

public class IndianCoinsUsingKanpSack {
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int amount = 1059;
        int noOfCoinsUsed = findMinCoinsUsed(coins, amount);
        System.out.println("\nCoins Used =" + noOfCoinsUsed);
    }
    private static int findMinCoinsUsed(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            if (amount >= coins[i]) {
                while (amount >= coins[i]) {
                    amount -= coins[i];
                    System.out.print(coins[i] + " + ");
                    count++;
                }
            }
        }
        return count;
    }
}
