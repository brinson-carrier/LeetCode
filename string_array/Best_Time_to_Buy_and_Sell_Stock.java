class Solution {
    public int maxProfit(int[] prices) {
    int low = prices[0];
    int best_sell = 0;
    int sell;
    for (int i = 0; i < prices.length; ++i) {
        if (prices[i] < low) {
            low = prices[i];
        }
        sell = prices[i] - low;
        if (sell > best_sell) {
            best_sell = sell;
        }
    }
    return best_sell;
    }
}