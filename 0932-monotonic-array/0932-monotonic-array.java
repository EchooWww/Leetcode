class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) return true;
        int i = 1;
        while(i < nums.length && nums[i]==nums[i-1]) i++;
        if (i == nums.length) return true;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if (nums[i] > nums[i-1]) {
            while (i < nums.length) {
                if (nums[i] < max) return false;
                max = nums[i++];
            }
        } else {
            while (i < nums.length) {
                if (nums[i] > min) return false;
                min = nums[i++];
            }
        }
        return true;
    }
}