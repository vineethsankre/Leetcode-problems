class Solution {
    public int maxProfit(int[] prices) {
        int minbuyingPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minbuyingPrice);
            minbuyingPrice = Math.min(minbuyingPrice, prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        Solution solution = new Solution();
        int maxProfit = solution.maxProfit(prices);
        System.out.println(maxProfit);
    }
}