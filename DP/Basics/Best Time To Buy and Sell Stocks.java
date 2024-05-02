class Solution {
    // Simple approach
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int price : prices){
            minPrice = Math.min(minPrice, price);

            int potentialProfit = price - minPrice;
            maxProfit = Math.max(maxProfit, potentialProfit);
        }

        return maxProfit;
    }
  //dp
  int maxProfit(int[] prices){
    int buy_price = prices[0];

    int profit = 0;

    for(int i = 1; i < prices.length; i++){
      if(prices[i] > buy_prices){
        buy_price = prices[i];
      } else {
        int current_profit = prices[i] - buy_price;
        profit = Math.max(current_profit, profit);
      }
    }
    return profit;

  }
}
