package Basic.Arrays;

public class BestTimeTOSellAndBuyStockUsingOptimizedApproach {
    public static void main(String[] args) {

        int price[] = { 7, 1, 5, 3, 6, 4 };

        int profit = maximumProfit(price);
        System.out.println("Maximum Profit would be :" + profit);
    }

    private static int maximumProfit(int[] price) {

        int minPrice = price[0];
        int DayToBuy = 0;
        int DayToSell = 0;
        int maxProfit = Integer.MIN_VALUE;

        for(int i = 1; i<price.length; i++){

            int profit = price[i] - minPrice;
            if(profit < 0){
                minPrice = price[i];
                DayToBuy = i+1;
            }
            if(profit > maxProfit){
                maxProfit = profit;
                DayToSell = i+1;
            }
        }
        System.out.println( " Buying Day " + DayToBuy + " Best Day to sell " + DayToSell);
        return maxProfit;
    }
}
