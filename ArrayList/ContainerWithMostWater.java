package ArrayList;


public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] heights = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int waterAmount = findMaxWaterAmount(heights);
        System.out.println(waterAmount);
    }
    private static int findMaxWaterAmount(int[] heights) {
        int maxWater = Integer.MIN_VALUE;
        int first = 0;
        int last = heights.length - 1;
        while (first <= last) {
            int width = last - first;
            int minHeight = Math.min(heights[first], heights[last]);
            int currWater = minHeight * width;
            maxWater = Math.max(maxWater, currWater);
            if(heights[first] <= heights[last]){
                first++; 
            } else {
                  last--;
            }
        } 
        return maxWater;
    }
}