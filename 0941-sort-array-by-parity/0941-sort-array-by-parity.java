class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] temp = new int[nums.length];
        int l = 0, r = nums.length - 1;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] %2 == 0) temp[l++] = nums[i];
            else temp[r--] = nums[i];
        }
        return temp;
    }
}