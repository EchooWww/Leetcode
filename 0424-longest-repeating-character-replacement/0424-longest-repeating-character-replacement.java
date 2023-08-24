class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, maxFreq = 0, res = 0, len = s.length();
        // Create an int array for letter frequencies
        int[] count = new int[26];
        // For-loop of the right boundary of window
        for (int r = 0; r < len; r++) {
            // When expanding the window, increment the frequency of the new element, also keep a record of the most frequent element within or window
            maxFreq = Math.max(maxFreq, ++count[s.charAt(r) - 'A']);
            // When maxFreq + k < window size, i.e., not able to achieve our goal, shrink the window, and update the frequency of the excluded element
            while (maxFreq + k < r - l + 1) {
                count[s.charAt(l)-'A']--;
                l++;
            }
            // For each iteration, compare the current valid window to previous max
            res = Math.max(res, r - l + 1);
        }
        // After the for-loop, we got the longest window
        return res;
    }
}