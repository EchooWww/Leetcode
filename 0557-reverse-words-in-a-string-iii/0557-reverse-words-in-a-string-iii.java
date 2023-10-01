class Solution {
    public String reverseWords(String s) {
        int fast = 0, slow = 0;
        StringBuilder sb = new StringBuilder();
        while (fast < s.length()) {
            while (fast < s.length() && s.charAt(fast) != ' ') {
                fast++;
            }
            int left = slow;
            for (int k = fast - 1; k >= left; k--) {
                sb.append(s.charAt(k));
                slow++;
            }
            if (fast != s.length()) sb.append(' ');
            slow++;
            fast++;
        }
        return sb.toString();
    }
}