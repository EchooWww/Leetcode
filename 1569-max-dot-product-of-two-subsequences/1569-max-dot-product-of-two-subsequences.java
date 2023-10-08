class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int max1 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, max2 = Integer.MIN_VALUE, min2 = Integer.MAX_VALUE;
        for(int n: nums1) {
            max1 = Math.max(max1, n);
            min1 = Math.min(min1, n);
        }
        for(int n: nums2) {
            max2 = Math.max(max2, n);
            min2 = Math.min(min2, n);
        }
        if (max1 < 0 && min2 > 0 || min1 > 0 && max2 < 0) 
            return Math.max(max1 * min2, min1 * max2);
        int m = nums1.length, n = nums2.length;
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = Math.max(dp[i-1][j-1]+nums1[i-1]*nums2[j-1], Math.max(dp[i-1][j], dp[i][j-1]));
            }
        }
        return dp[m][n];
    }
}