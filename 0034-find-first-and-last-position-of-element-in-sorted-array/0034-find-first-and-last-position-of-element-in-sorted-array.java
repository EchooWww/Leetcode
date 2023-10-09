class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int leftBound = Integer.MAX_VALUE, rightBound = Integer.MIN_VALUE;
        while (l <= r) {
            int mid = l +  (r - l) / 2 ;
            if (nums[mid] >= target) {
                if (nums[mid] == target) leftBound = Math.min(mid, leftBound);
                r = mid - 1;
            } else l = mid + 1;
        }
        l = 0;
        r = nums.length - 1;
        while (l <= r) {
            int mid = l +  (r - l) / 2 ;
            if (nums[mid] <= target) {
                if (nums[mid] == target) rightBound = Math.max(mid, rightBound);
                l = mid + 1;
            } else r = mid - 1;
        }
        return leftBound == Integer.MAX_VALUE? new int[]{-1, -1} :new int[]{leftBound, rightBound};
    }
}