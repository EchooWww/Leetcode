class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] frontMax = new int[n];
        int[] backMax = new int[n];
        int water = 0;
        frontMax[0] = height[0];
        backMax[n - 1] = height[n -1];
        for(int i = 1; i < n; i++) frontMax[i] = Math.max(frontMax[i-1], height[i]);
        for (int i = n - 2; i >= 0; i--) backMax[i] = Math.max(backMax[i + 1], height[i]);
        for (int i = 0; i < n; i++) {
            water += Math.min(frontMax[i], backMax[i]) - height[i];
        }
        return water;
    }
}