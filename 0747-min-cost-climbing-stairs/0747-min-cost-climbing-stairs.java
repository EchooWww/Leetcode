class Solution {
    int[] memo;
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        memo = new int[n];
        return Math.min(dp(cost, n-1), dp(cost, n-2));
    }

    int dp (int[] cost, int n) {
        if (memo[n] != 0) return memo[n];
        if (n <= 1) {
            memo[n] = cost[n];
            return memo[n];
        }
        memo[n] = cost[n] + Math.min(dp(cost, n-1), dp(cost, n-2));
        return memo[n];
    }

}