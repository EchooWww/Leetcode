class Solution:
    def combinationSum3(self, k: int, n: int) -> List[List[int]]:
        path = []
        ans = []
        def dfs (i, curr):
            # pruning
            if (n < 0 
                or curr > n 
                or 10 - i < k - len(path) 
                or curr + sum(range(i, 10)) < n):
                return
            if len(path) == k and curr == n:
                ans.append(path[:])
            for j in range (i, 10):
                path.append(j)
                dfs(j+1, curr + j)
                path.pop()
        dfs(1, 0)
        return ans
        