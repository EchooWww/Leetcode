class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int sum = nums[i] + findClose2Sum(nums, i+1, target - nums[i]);
            if (Math.abs(target - sum) < Math.abs(minDiff)) {
                minDiff = target - sum;
            }
        }
        return target - minDiff;
    }
    public int findClose2Sum (int[] nums, int start, int target) {
        int left = start, right = nums.length - 1, minDiff = Integer.MAX_VALUE;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (Math.abs(target - sum) < Math.abs(minDiff)) {
                minDiff = target - sum;
            }
            if (sum < target) left++;
            else right--;
        }
        return target - minDiff;
    }
}