class Solution {
    public int maxProfit(int[] prices) {
        int minBuyingPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i< prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i] - minBuyingPrice);
            minBuyingPrice = Math.min(prices[i], minBuyingPrice);
        }
        return maxProfit;
    }

}