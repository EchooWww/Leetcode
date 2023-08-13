class Solution {
    // a memo to reduce time complexity
    Map<Integer, Boolean> memo = new HashMap<>();
    public boolean validPartition(int[] nums) {
        // base case: empty array, always true
        memo.put(-1, true);
        return prefixIsValid(nums, nums.length -1);
    }

    public boolean prefixIsValid(int[] nums, int end) {
        boolean res = false;
        if (memo.containsKey(end)) return memo.get(end);
        
        // any of the 3 possibilities is true, res is true too
        
        // case 1: last 2 elements are equal 
        if (end > 0 && nums[end] == nums[end-1]) {
            res |= prefixIsValid(nums, end-2);
        }
        
        // case 2: last 3 elements are equal
        if (end > 1 && nums[end] == nums[end-1] && nums[end -1] == nums[end-2]) {
            res |= prefixIsValid(nums, end-3);
        }
        
        // case 3: last 3 elements are consecutive increasing
        if (end > 1 && nums[end] == nums[end-1] + 1 && nums[end -1] == nums[end-2] + 1) {
            res |= prefixIsValid(nums, end-3);
        }
        memo.put(end, res);
        return res;
    }
}