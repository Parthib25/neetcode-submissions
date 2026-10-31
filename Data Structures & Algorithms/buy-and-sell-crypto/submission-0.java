class Solution {
    public int maxProfit(int[] prices) {
      int i=0;
      int j=1;
      int profit=0;
      while(j<prices.length){
        int buyingPrice=prices[i];
        int sellingPrice=prices[j];
           if (buyingPrice < sellingPrice) {
                // If it's profitable, calculate profit and track the max
                int currentProfit = sellingPrice - buyingPrice;
                if (currentProfit > profit) {
                    profit = currentProfit;
                }
            } else{
                i=j;
            }
            j++;
      
    }
    return profit;
    }
    
}
