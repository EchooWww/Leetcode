class Solution {
    public String longestPalindrome(String s) {
        String Longest = "";
        if (s.length() <= 1) return s;
        for (int i = 0; i < s.length()-1; i++) {
            String odd = findPalindrome(s, i, i);
            String even = findPalindrome(s, i, i+1);
            Longest = odd.length() > Longest.length()? odd: Longest;
            Longest = even.length() > Longest.length()? even: Longest;
        }
        return Longest;
    }

    public String findPalindrome (String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l+1, r);
    }
 }