class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> triples = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            List<List<Integer>> pairs = find2Pair(nums, i+1, 0 - nums[i]);
            if (pairs.size() == 0) continue;
            for (int j = 0; j < pairs.size(); j++) {
                triples.add(new ArrayList(Arrays.asList(nums[i], pairs.get(j).get(0), pairs.get(j).get(1))));
            }
        }
        List<List<Integer>> res = new ArrayList<>(triples);
        return res;
    }

    public List<List<Integer>> find2Pair(int[] nums, int start, int target) {
        int l = start, r = nums.length - 1;
        List<List<Integer>> res =  new ArrayList<>();
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) res.add(new ArrayList(Arrays.asList(nums[l], nums[r])));
            if (sum < target) l++;
            else r--;
        }
        return res;
    }
}