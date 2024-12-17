class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        ans = []
        path = []
        n = len(nums)
        def dfs(i):
            if i == n:
                ans.append(path[:])
            else:
                dfs (i+1)
                
                path.append(nums[i])
                dfs (i+1)
                path.remove(nums[i])
        dfs(0)
        return ans