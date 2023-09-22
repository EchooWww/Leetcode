class Solution {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    if (candidates.length == 0) return res;
    backtrack(candidates, target, 0, 0);
    return res;
    }

    LinkedList<Integer> track  = new LinkedList<>();

    void backtrack (int[] candidates, int target, int start, int sum) {
        if (sum == target) {
            res.add(new LinkedList<>(track));
            return;
        }
        if (sum > target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            track.add(candidates[i]);
            sum += candidates[i];
            backtrack(candidates, target, i, sum);
            sum -= candidates[i];
            track.removeLast();
        }

    }
}