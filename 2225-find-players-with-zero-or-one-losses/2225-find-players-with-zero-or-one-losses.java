class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> winners = new HashSet<>();
        for (int[] game: matches) {
            winners.add(game[0]);
        }
        for (int[] game: matches) {
            winners.remove(game[1]);
        }
        List<Integer> res1 = new ArrayList<>();
        res1.addAll(winners);
        Collections.sort(res1);

        Map<Integer, Integer> loseOne = new HashMap<>();
        for (int[] game: matches) {
            loseOne.put(game[1], loseOne.getOrDefault(game[1], 0) + 1);
        }
        List<Integer> res2 = new ArrayList<>();
        for (int n: loseOne.keySet()) {
            if (loseOne.get(n) == 1) res2.add(n);
        }
        Collections.sort(res2);

        List<List<Integer>> res = new ArrayList<>();
        res.add(res1);
        res.add(res2);
        return res;
    }
}