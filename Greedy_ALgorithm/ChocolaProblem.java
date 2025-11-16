package Greedy_ALgorithm;

import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };
        int finalCost = findMinCostToCutBoard(costHor, costVer);
        System.out.println("FInal Min COst is " + finalCost);
    }
    public static int findMinCostToCutBoard(Integer[] costHor, Integer[] costVer) {
        // SOrt in Ascending order to start with max cost 
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());
        int h= 0, v = 0; // pointer to poin to the costs for comparison 
        int hp = 1, vp = 1; // no of parts divided after cutting 
        int cost =0; 
        while (h < costHor.length && v < costVer.length) {
            if(costVer[v] <= costHor[h]){
                cost += ( costHor[h] * vp);
                hp++;
                h++;
            }else{
                cost += ( costVer[v++] * hp);
                vp++;
            }
        }
        while(h < costHor.length){
            cost += ( costHor[h++] * vp);
            hp++;
        }
        while(v < costVer.length ){
            cost += ( costVer[v++] * hp);
            vp++;
        }
        return cost;
    }
}
