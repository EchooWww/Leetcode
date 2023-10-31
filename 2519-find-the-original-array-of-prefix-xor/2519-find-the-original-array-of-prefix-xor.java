class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int[] nums = new int[n];
        nums[0] = pref[0];
        for (int i = 1; i < n; i++) {
            nums[i] = pref[i] ^ pref[i-1];
        }
        return nums;
    }
}