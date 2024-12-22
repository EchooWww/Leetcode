class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> track = new LinkedList<>();
        backtrack(n, k, 1, track);
        return res;
    }

    void backtrack(int n, int k, int start, List<Integer> track) {
        if (track.size() == k) {
            res.add(new LinkedList(track));
            return;
        }
        if (k <= 0 || n <=0 ) return;
        for (int i = start; i <= n; i++) {
            track.add(i);
            backtrack(n, k, i+1, track);
            track.remove(track.size() - 1);
        }
    }
}