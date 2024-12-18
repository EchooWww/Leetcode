class Solution:
    def partition(self, s: str) -> List[List[str]]:
        ans = []
        path = []
        n = len(s)
        def dfs(i, start):
        # decide whether to choose the "comma" between i and i + 1. i.e., split after i.
            if i == n: 
                ans.append(path[:])
                return
            if i < n-1:
                dfs (i+1, start) # not choose the comma, so don't move "start"
            sub = s[start:i+1]
            if sub == sub [::-1]:
                path.append(sub)
                dfs(i+1, i+1) # choose the comma, so start is now the same as i + 1
                path.pop()
        dfs(0, 0)
        return ans
        