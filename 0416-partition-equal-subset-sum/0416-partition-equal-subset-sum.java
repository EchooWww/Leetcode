class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0, n = nums.length;
        Arrays.sort(nums);
        for(int num: nums) sum+=num;
        if (sum%2 == 1) return false;
        boolean[][] dp = new boolean[n+1][sum/2+1];
        for(int k = 0; k <= n; k++) {
            dp[k][0] = true;
        }
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum/2; j++) {
                if (j>=nums[i-1]) {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum/2];
    }
}