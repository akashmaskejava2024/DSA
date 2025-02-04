package Basic.Arrays;

public class BestTimeTOSellAndBuyStockUsingBruteForce {

        public static void main(String[] args) {

                int price[] = { 7, 1, 5, 3, 6, 4 };

           int profit =     maximumProfit(price);
           System.out.println("Maximum Profit would be :" + profit);

        }

        private static int maximumProfit(int[] price) {
         
        // lowestPrice Auxilllary Array
         int lowestPrice[] = new int[price.length];

         lowestPrice[0] = price[0];

         for(int i = 1;i<price.length; i++){

                lowestPrice[i] = Math.min(price[i] , lowestPrice[i-1]);

         }

         // Highest Price Auxillary Array

         int highestPrice[] = new int[price.length];

         highestPrice[highestPrice.length-1] = price[price.length -1];

         for(int i = price.length -2; i>=0; i--){

                highestPrice[i] = Math.max(price[i], highestPrice[i+1]);
         }

         // get diff for each transaction 



         int maxProfit = Integer.MIN_VALUE;
         int profit = 0;
         for(int i = 0; i< price.length; i++){

             profit = highestPrice[i] - lowestPrice[i];
             if(profit > maxProfit){
                maxProfit = profit;
             }



                 

         }

         if(maxProfit < 0 ){
                return 0;
         }
         return maxProfit;
         
         


        }
}