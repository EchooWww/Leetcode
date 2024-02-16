class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n: arr) freq.put(n, freq.getOrDefault(n,0) + 1);

        List<Integer> sorted = new ArrayList<>(freq.values());
        Collections.sort(sorted);

        int res = sorted.size();
        for (int n: sorted) {
            if (n <= k) {
                k -= n;
                res--;
            }
            else break;
        }
        return res;
    }
}