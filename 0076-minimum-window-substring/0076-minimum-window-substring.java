class Solution {
    public String minWindow(String s, String t) {
        // an array to keep track of remaining chars in t which are not yet covered in substring
        int[] remain = new int[128];
        // valid: num of valid chars within the current window
        int valid = 0, left = 0, right = 0, minLen = Integer.MAX_VALUE, start = 0;
        for (char c: t.toCharArray()) remain[c]++;
        while (right < s.length()) {
            if (remain[s.charAt(right)] > 0) {
                valid++;
            }
            remain[s.charAt(right)]--;
            right++;
            while (valid == t.length()) {
                if (right - left < minLen) {
                    start = left;
                    minLen = right - left;
                }
                if (remain[s.charAt(left)] == 0) {
                    valid--;
                }
                remain[s.charAt(left)]++;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "":s.substring(start, start + minLen);
    }
}