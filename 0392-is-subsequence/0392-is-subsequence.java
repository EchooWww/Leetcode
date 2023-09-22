class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0, tp = 0;
        char[] schar = s.toCharArray(), tchar = t.toCharArray();
        while (sp < s.length()) {
            while (tp < t.length() && schar[sp] != tchar[tp]) tp++;
            sp++;
            if (tp >= t.length()) return false;
            tp++;
        }
        return true;
    }
}