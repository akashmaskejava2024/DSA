package Greedy_ALgorithm;

import java.util.Arrays;

public class JobSequencingProblem {

    public static void main(String[] args) {
        // { deadline, profit }
        int[][] jobs = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        int maxProfit = findMaxProfit(jobs);
        System.out.println("\nMaximum Profit would be " + maxProfit);
    }

    public static int findMaxProfit(int[][] jobs) {
        int n = jobs.length;

        // Attach original index to each job for printing
        int[][] indexedJobs = new int[n][3]; // {originalIndex, deadline, profit}
        for (int i = 0; i < n; i++) {
            indexedJobs[i][0] = i;
            indexedJobs[i][1] = jobs[i][0];
            indexedJobs[i][2] = jobs[i][1];
        }

        // Sort jobs by profit descending
        Arrays.sort(indexedJobs, (a, b) -> b[2] - a[2]);

        // Find max deadline to define slots
        int maxDeadline = 0;
        for (int[] job : jobs) {
            maxDeadline = Math.max(maxDeadline, job[0]);
        }

        int[] slots = new int[maxDeadline + 1]; // slot[i] = index of job scheduled at time i
        Arrays.fill(slots, -1);

        int totalProfit = 0;
        int totalJobs = 0;

        System.out.print("Jobs done (original index): ");
        for (int[] job : indexedJobs) {
            int originalIdx = job[0];
            int deadline = job[1];
            int profit = job[2];

            // Find a free slot from deadline to 1
            for (int t = deadline; t > 0; t--) {
                if (slots[t] == -1) {
                    slots[t] = originalIdx;
                    totalProfit += profit;
                    totalJobs++;
                    System.out.print(originalIdx + " ");
                    break;
                }
            }
        }

        System.out.println("\nTotal Jobs Done: " + totalJobs);
        return totalProfit;
    }
}