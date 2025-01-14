class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def reverse_part(nums:List[int], start: int, end: int):
            while start < end:
                nums[start], nums[end] = nums[end], nums[start]
                start += 1
                end -= 1
        
        n = len(nums)
        steps = k % n
        reverse_part(nums, 0, n - steps - 1)
        reverse_part(nums, n - steps, n - 1)
        reverse_part(nums, 0, n -1)
        
