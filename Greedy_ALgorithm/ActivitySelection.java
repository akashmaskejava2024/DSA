package Greedy_ALgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        System.out.println(maxNoofActivities(start, end));
    }
    public static int maxNoofActivities(int[] start, int[] end) {
        int[][] activities = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        // this will sort according to the 2nd column of the 2d array
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));
        List<Integer> list = new ArrayList<>();
        int maxAct = 0;
        // first activity
        maxAct = 1;
        list.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < activities.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                list.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        } 
        for (int j = 0; j < list.size(); j++) {
            System.out.print("A" + list.get(j) + " ");
        }
        return maxAct;
    }
}
