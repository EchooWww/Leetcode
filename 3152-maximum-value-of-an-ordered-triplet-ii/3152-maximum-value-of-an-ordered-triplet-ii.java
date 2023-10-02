class Solution {
   public long maximumTripletValue(int[] nums) {
       int n = nums.length;
       int[] prefix = new int[n], suffix = new int[n];
       long ans = 0;
       prefix[0] = nums[0];
       suffix[n - 1] = nums[n - 1];
       for (int i = 1; i < n; i++) {
           prefix[i] = Math.max(nums[i], prefix[i - 1]);
       }
       for (int i = n - 2; i >= 0; i--) {
           suffix[i] = Math.max(nums[i], suffix[i + 1]); 
       }
        for (int i = 1; i < n - 1; i++) {
            ans = Math.max(ans, (long)(prefix[i - 1] - nums[i])* suffix[i + 1] );
        }
        return ans;
    }
}