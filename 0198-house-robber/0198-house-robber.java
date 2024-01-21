class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        if (n==1) return nums[0];
        res[0] = nums[0];
        for (int i = 1; i < n; i++) {
            if (i == 1) res[i] = nums[i];
            else if (i == 2) res[i] = nums[i] + nums[i-2];
            else res[i] = Math.max(res[i-2], res[i-3]) + nums[i];
        }
        return Math.max(res[n-1], res[n-2]);
    }
}