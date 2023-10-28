class Solution {
    public int countVowelPermutation(int n) {
        final int MOD = 1000000007;
        long [][] nums = new long[n][5];
        Arrays.fill(nums[0], 1);
        for(int i = 1; i < n; i++) {
            nums[i][0] = (nums[i-1][1] + nums[i-1][2] + nums[i-1][4]) % MOD;
            nums[i][1] = (nums[i-1][0] +  nums[i-1][2])% MOD;
            nums[i][2] = (nums[i-1][1] +  nums[i-1][3])% MOD;
            nums[i][3] = nums[i-1][2] % MOD;
            nums[i][4] = (nums[i-1][2] +  nums[i-1][3]) % MOD;
        }
        return (int)((nums[n-1][0] + nums[n-1][1] + nums[n-1][2] + nums[n-1][3] + nums[n-1][4])% MOD);
    }
}