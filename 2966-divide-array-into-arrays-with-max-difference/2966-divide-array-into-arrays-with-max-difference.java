class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int[][] res = new int[n/3][3];
        for (int i = 0; i < n; i++) {
            if (i % 3 == 1) {
                if (nums[i] - nums[i-1] > k) return new int[][]{};
            }
            if (i % 3 == 2) {
                if (nums[i] - nums[i-2] > k) return new int[][]{};
            }
            res[i/3][i%3] = nums[i];
        }
        return res;
    }
}