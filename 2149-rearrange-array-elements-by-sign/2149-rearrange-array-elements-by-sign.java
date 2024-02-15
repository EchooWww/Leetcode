class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int pos = 0, neg = 1, curr = 0;
        while (curr < n) {
            if (nums[curr] > 0) {
                res[pos] = nums[curr++];
                pos += 2;
            } else {
                res[neg] = nums[curr++];
                neg += 2;
            }
        }

        return res;
    }
}