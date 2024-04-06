class Solution {
    public String makeGood(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) != s.charAt(i+1) && Character.toUpperCase(s.charAt(i)) == Character.toUpperCase(s.charAt(i+1))) {
                    s = s.substring(0, i) + s.substring(i+2);
                    i = -1;
                }
        }
        return s;
    }
}