class Solution {
    public int minimizeMax(int[] nums, int p) {
        if (p==0) return 0;
        Arrays.sort(nums);
        int lo = 0, n = nums.length, hi = nums[n-1] - nums[0];
        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (solve(nums, mid, p)) hi = mid - 1;
            else lo = mid + 1;
        }
        return lo;
    }

    public boolean solve (int[] nums, int limit, int pair) {
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i + 1] - nums[i] <= limit) {
                count++;
                i++;
            }
            if (count == pair) return true;
        }
        return false;
    }
}