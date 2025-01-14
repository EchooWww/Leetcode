class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit, buyIn = 0, prices[0]
        for j in range(1, len(prices)):
            buyIn = min(prices[j], buyIn)
            profit = max(profit, prices[j] - buyIn)
        return profit

