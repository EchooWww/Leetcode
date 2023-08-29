class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> combos = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    combos.add(new ArrayList<>(Arrays.asList(nums[i], nums[l++], nums[r--])));
                } else if (nums[i] + nums[l] + nums[r] > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        res.addAll(combos);
        return res;
    }
}