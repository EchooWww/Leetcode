class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        for(int i = 0; i < s.length(); i++) {
            String s1 = findPalindrome(s, i, i);
            String s2 = findPalindrome(s, i, i+1);
            longest = s1.length()>longest.length()? s1:longest;
            longest = s2.length()>longest.length()? s2:longest;
        }
        return longest;
        
    }
    
    public String findPalindrome(String s, int l, int r) {
        while(l >= 0 && r < s.length()&& s.charAt(l)==s.charAt(r) ) {
            l--;
            r++;
        }
        return s.substring(l+1, r);
    }
}