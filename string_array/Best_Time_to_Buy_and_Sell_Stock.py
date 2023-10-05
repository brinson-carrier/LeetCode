class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        low = prices[0]
        best_sell = 0
        sell = 0
        for i in prices:
            if i < low:
                low = i
            sell = i - low
            if sell > best_sell:
                best_sell = sell
        return best_sell