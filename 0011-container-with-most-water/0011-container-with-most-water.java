class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int res = 0;
        while (l < r) {
            if (height[l] <= height[r]) res = Math.max(res, (r-l) * height[l++]);
            else res = Math.max(res, (r-l) * height[r--]);
        }
        return res;
    }
}