class Solution {
    public char findTheDifference(String s, String t) {
        int [] freq1 = new int[26];
        for (char c: s.toCharArray()) {
            freq1[c-'a']++;
        }
        int [] freq2 = new int[26];
        for (char c: t.toCharArray()) {
            freq2[c-'a']++;
        }
        for (int p = 0; p < 26; p++) {
            if (freq2[p]- freq1[p] == 1) return (char)('a' + p);
        }
        return ' ';
    }
}