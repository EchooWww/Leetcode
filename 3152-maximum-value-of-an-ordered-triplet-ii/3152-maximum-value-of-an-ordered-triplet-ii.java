class Solution {
   public long maximumTripletValue(int[] nums) {
       long res = 0;
       long leftMax = 0;
       long rightMax = 0;;
       for(int n : nums) {
           res = Math.max(res, leftMax * n);
           leftMax = Math.max(leftMax, rightMax - n);
           rightMax = Math.max(rightMax, n);
       }
       return res;
    }
}