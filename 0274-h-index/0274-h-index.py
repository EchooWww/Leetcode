class Solution:
    def hIndex(self, citations: List[int]) -> int:
        # greedy solution: the maximum possible n is len(citations), so we keep another list of count frequencies
        n = len(citations)
        count = [0] * (n + 1)
        currCount = 0
        for c in citations:
          count[min(n,c)] += 1 # if citation > n, then it should be added to n
        for i in range(n, -1, -1):
            currCount += count[i]
            if currCount >= i:
                return i
        return currCount