package Basics;

public class BestTimeToBuyAndSellStocks {
    public static int maxProfit(int[] prices){
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
            int currentPrice = prices[i];
            if(currentPrice < minPrice){
                minPrice = currentPrice;
            } else {
                int profit = currentPrice - minPrice;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
      return maxProfit;
    }
    public static void main(String[] args){
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum profit: "+ maxProfit);
    }
}
