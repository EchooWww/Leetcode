class Solution {
    public int minSwaps(int[] nums) {
        int cnt1 = 0;
        int currCnt = 0;
        int arrSize = nums.length;
        for (int n: nums) cnt1 += n;
        for (int i = 0; i < cnt1; i++) currCnt += nums[i];
        int maxCnt = currCnt;
        for (int j = cnt1; j < arrSize + cnt1 - 1; j++) {
            currCnt += (nums[j%arrSize] - nums[j-cnt1+1]);
            maxCnt = Math.max(maxCnt, currCnt);
        }
        return cnt1 - maxCnt;
    }
}