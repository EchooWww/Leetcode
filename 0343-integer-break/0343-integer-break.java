class Solution {
    int[] memo;
    public int integerBreak(int n) {
        memo = new int[n + 1];
        return dp(n);
    }
    int dp(int n) {
        if (n <= 1) return n;
        if (memo[n] > 0) return memo[n];
        int res = 0;
        for (int i = 1; i < n+1; i++) 
            res = Math.max(res, i * Math.max(dp(n-i), n-i));
        memo[n] = res;
        return res;
    }

}