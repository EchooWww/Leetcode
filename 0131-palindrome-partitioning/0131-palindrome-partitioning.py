class Solution:
    def partition(self, s: str) -> List[List[str]]:
        ans = []
        path = []
        n = len(s)
        def dfs (i):
            if i == n: # traveresed to the end of list: add one path to the answer
                ans.append(path[:])
                return
            for j in range (i, n):
                sub = s[i:j+1]
                if sub == sub[::-1]: # check if palindrome
                    path.append(sub)
                    dfs(j+1) # recursively find the next palindrome substring from the new starting point 
                    path.pop()
        dfs(0)
        return ans
        