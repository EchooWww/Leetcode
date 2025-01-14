class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i, j = 1, 1
        n = len(nums)
        for j in range (1, n):
            if nums[j] == nums[j-1]:
                continue
            nums[i] = nums[j]
            i += 1
        return i