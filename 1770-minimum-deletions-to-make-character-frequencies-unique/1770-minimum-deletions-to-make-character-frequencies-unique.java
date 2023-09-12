class Solution {
    public int minDeletions(String s) {
        Integer[] freq = new Integer[26];
        for (int i = 0; i < 26; i++) {
            freq[i] = 0; // Initialize each element to 0
        }
        for (char c: s.toCharArray()) {
            freq[c-'a']++;
        }
        Arrays.sort(freq, (a, b) ->b-a);
        int res = 0;
        for (int i = 1; i < 26; i++) {
            while (freq[i] != 0 && freq[i] >= freq[i-1]) {
                freq[i]--;
                res++;
            }
        }
        return res;
    }
}