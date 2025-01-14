class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        candidate = nums[0]
        vote = 1
        for j in range(1, len(nums)):
            if nums[j] == candidate:
                vote += 1
            else: 
                vote -= 1
                if vote == -1:
                    candidate = nums[j]
                    vote = 1
        return candidate