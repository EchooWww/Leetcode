class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int p = 0, n = 0, curr = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                p = i;
                break;
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] < 0) {
                n = i;
                break;
            }
        }
        while (curr < len) {
            if (p < len && curr < len) {
                res[curr++] = nums[p++];
                while (p < len && nums[p] < 0) p++;
            }
            if (n < len && curr < len) {
                res[curr++] = nums[n++];
                while (n < len && nums[n] > 0) n++;
            }

        }
        return res;
    }
}