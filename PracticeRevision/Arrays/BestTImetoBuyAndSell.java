package PracticeRevision.Arrays;


public class BestTImetoBuyAndSell {
    public static void main(String[] args) {

        int price[] = { 7, 1, 5, 3, 6, 4 };

        int profit = maximumProfit(price);
        System.out.println("Maximum Profit would be :" + profit);

    }

    private static int maximumProfit(int[] price) {

        int bestDaytoBuy = 0; 
        int bestDayToSell = 0; 
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0 ;i < price.length; i++){

            int todaysPrice = price[i]; 

            if(buyingPrice < todaysPrice){

                int profit = todaysPrice - buyingPrice;
                
                if(maxProfit > profit){
                    
                    bestDayToSell = i;

                 }
                 maxProfit = Math.max(maxProfit, profit);
                


            } else {

                bestDaytoBuy = i + 1; 
                buyingPrice = todaysPrice;

            }

        }

        System.out.println(bestDaytoBuy  + "to " + bestDayToSell);

        return maxProfit;
    }
}
