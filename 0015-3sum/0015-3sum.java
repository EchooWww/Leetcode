class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> triples = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    triples.add(new ArrayList(Arrays.asList(nums[i], nums[l++], nums[r--])));
                }
                else if (sum < 0) l++;
                else r--;
            }
        }

        return new ArrayList(triples);
    }

}