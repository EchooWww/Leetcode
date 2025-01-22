class Solution:
    def canJump(self, nums: List[int]) -> bool:
        n = len(nums)
        longest = 0
        for i in range (n):
            if i > longest:
                return False
            longest = max(longest, i + nums[i])
        return longest >= n -1


        