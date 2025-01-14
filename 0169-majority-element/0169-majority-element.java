class Solution {
    public int majorityElement(int[] nums) {
        int vote = 0;
        int candidate = 0;
        for(int num: nums) {
            if (vote == 0) candidate = num;
            if (candidate == num) vote++;
            else vote--;
        }
        return candidate;
    }
}