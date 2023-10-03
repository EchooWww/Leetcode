class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int n: nums) freq.put(n, freq.getOrDefault(n, 0) + 1);
        for (int k: freq.values()) {
            if (k >= 2) pairs += k*(k-1)/2;
        }
        return pairs;
    }
}