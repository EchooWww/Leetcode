class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit, buyIn = 0, prices[0]
        for j in range(1, len(prices)):
            if prices[j] < buyIn:
                buyIn = prices[j]
            else:
                profit = max(profit, prices[j] - buyIn)
        return profit

