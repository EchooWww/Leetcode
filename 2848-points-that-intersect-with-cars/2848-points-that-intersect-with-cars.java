class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        nums.sort((a,b)->a.get(0)-b.get(0));
        int res = 0, max = 0;
        for(int i = 0; i < nums.size(); i++) {
            if (nums.get(i).get(0) > max) {
                res += nums.get(i).get(1) - nums.get(i).get(0) + 1;
            } else if (nums.get(i).get(1) > max) {
                res += nums.get(i).get(1) - max;
            }
            max = Math.max(max, nums.get(i).get(1));   
        }
        return res;
    }
}