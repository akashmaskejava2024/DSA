package Greedy_ALgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {
    public static void main(String[] args) {
        int[] weight = { 10, 20, 30 };
        int[] value = { 60, 100, 120 };
        int totalWeight = 50;
        System.out.println(findMaxValuesinKnapsack(weight, value, totalWeight));
    }
    public static int findMaxValuesinKnapsack(int[] weight, int[] value, int totalWeight) {
        double[][] ratio = new double[weight.length][2];
        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        // soert according to the ratios
        int capacity = totalWeight;
        int addedValue = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx =(int) ratio[i][0];
            if (capacity >= weight[idx]) {
                capacity -= weight[idx];
                addedValue += value[idx];
            } else {
                addedValue += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        return addedValue;
    }
}
