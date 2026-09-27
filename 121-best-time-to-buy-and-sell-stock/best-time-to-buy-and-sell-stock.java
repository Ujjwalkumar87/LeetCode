class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int bestbuy = prices[0];
        for(int i = 0; i < prices.length; i++){
            bestbuy = Math.min(bestbuy , prices[i]);
            if(prices[i] > bestbuy){
                maxprofit = Math.max(maxprofit , prices[i] - bestbuy);
            }
            //     
        }
        return maxprofit;
    }
}