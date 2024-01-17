class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numToFreq = new HashMap<>();
        for(int n: arr) numToFreq.put(n, numToFreq.getOrDefault(n, 0) + 1);
        Set<Integer> freqs = new HashSet<>();
        freqs.addAll(numToFreq.values());
        return freqs.size() == numToFreq.values().size();
    }
}