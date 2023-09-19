class Solution {
    public int strStr(String haystack, String needle) {
        int needleLen = needle.length(), hayLen = haystack.length();
        if (needleLen > hayLen) return -1;
        if (needleLen == hayLen) return needle.equals(haystack)? 0: -1;
        for (int i = 0; i <= hayLen - needleLen; i++) {
            int l = i, r = i + needleLen - 1;
            if (needle.equals(haystack.substring(l, r+1))) return i;
        }
        return -1;
    }
}