class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return nSumTarget(nums, 4, 0, target);
    }

    public List<List<Integer>> nSumTarget(int[] nums, int n, int start, long target) {
        List<List<Integer>> res = new ArrayList<>();
        if (n == 2) {
            int l = start, r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r], left = nums[l], right = nums[r];
                if (sum == target) {
                    res.add(new ArrayList<>(Arrays.asList(left, right)));
                    while (l < r && nums[l] == left) l++;
                    while (l < r && nums[r] == right) r--;
                } else if (sum > target) {
                    while (l < r && nums[r] == right) r--;
                } else {
                    while (l < r && nums[l] == left) l++;
                }
            }
        } else {
            for (int i = start; i < nums.length; i++) {
                List<List<Integer>> parts = nSumTarget(nums, n-1, i + 1, target - nums[i]);
                for (List<Integer> part: parts) {
                    part.add(nums[i]);
                    res.add(part);
                }
        
                while ( i < nums.length - 1 && nums[i + 1] == nums[i]) i++;
            }
        }
        return res;
    }
}