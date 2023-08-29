class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        for(int i = 0; i < s.length(); i++) {
            // consider the substring be centered with 1 or 2 characters
            String odd = findPalindrome(s, i, i);
            String even = findPalindrome(s, i, i+1);
            longest = odd.length() > longest.length()? odd:longest;
            longest = even.length() > longest.length()? even:longest;
        }
        return longest;
    }
    
    // for each center, find the longest palindromic substring
    public String findPalindrome(String s, int l, int r) {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l+1, r);
    }
}