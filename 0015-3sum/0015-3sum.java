class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> res = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (map.containsKey(0-nums[i]-nums[j])) {
                    res.add(new LinkedList<>(Arrays.asList(nums[i], nums[j], 0-nums[i]-nums[j])));
                }
            }
            map.put(nums[i], i);
        }
        return new LinkedList(res);
    }
}