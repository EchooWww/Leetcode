class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        ans = []
        path = []
        def dfs(i):
            if n - i + 1 < k - len(path):
                return
            if k == len(path):
                ans.append(path[:])
                return
            for j in range(i, n+1):
                path.append(j)
                dfs(j+1)
                path.pop()
        dfs(1)
        return ans
        