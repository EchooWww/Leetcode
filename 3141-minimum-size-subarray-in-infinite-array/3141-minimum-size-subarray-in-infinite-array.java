class Solution {
    public int minSizeSubarray(int[] nums, int target) {
        int sum = 0, left = 0, right = 0, minWin = Integer.MAX_VALUE, len = nums.length;
        for (int n: nums) sum += n;
        if (target % sum == 0) return target / sum * len;
        int winSum = nums[0];
        while (right < 2 * len && left <= right) {
            if (winSum == target % sum)  minWin = Math.min(minWin, right - left + 1);
            if (winSum <= target % sum) {
                right++;
                winSum += nums[right % len];
            } else {
                winSum -= nums[left % len];
                left++;
            }
            if (left > right) {
                right ++;
                winSum += nums[right % len];
            } 
        }
        return minWin == Integer.MAX_VALUE? -1 :target / sum * len + minWin;
    }
}