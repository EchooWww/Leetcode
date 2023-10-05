class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> track = new LinkedList<>();
        backtrack(nums, 0, track);
        return res;
    }

    void backtrack(int[] nums, int start, List<Integer> track) {
        res.add(new LinkedList<>(track));
        for (int i = start; i < nums.length; i++) {
            track.add(nums[i]);
            backtrack(nums, i+1, track);
            track.remove(track.size()-1);
        }
    }
}