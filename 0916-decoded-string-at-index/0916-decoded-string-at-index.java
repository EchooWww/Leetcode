 class Solution {
    public String decodeAtIndex(String s, int k) {
        long decodedSize = 0;
        for (char c: s.toCharArray()) {
            if (Character.isDigit(c)) decodedSize *= (c-'0');
            else decodedSize++;
        }

        for (int i = s.length()-1; i >= 0; i--) {
             char c = s.charAt(i);
             k %= decodedSize;
             if (k==0 && Character.isLetter(c)) return String.valueOf(c);
             if (Character.isDigit(c)) decodedSize /= (c - '0');
             else decodedSize--;
        }
        return " ";
    }
}