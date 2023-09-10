class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            // current minimum
            if (nums[i] <= min1) min1 = nums[i];
            // current 2nd minimum: > min1 && <= min2, after minimum
            else if (nums[i] <= min2) min2 = nums[i]; 
            // current value: if larger than min1 and min2, as the loop goes from left to right, satisfies the condition
            else return true;
        }
        return false;
    }
}