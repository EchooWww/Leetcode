class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        prefixs = [1] * n
        suffixes = [1] * n
        res = [0] * n
        for i in range(1, n):
            prefixs[i] = prefixs[i-1] * nums[i-1]
        for i in range(n-2, -1, -1):
            suffixes[i] = suffixes[i+1] * nums[i+1]
        for i in range(n):
            res[i] = prefixs[i] * suffixes[i]
        return res