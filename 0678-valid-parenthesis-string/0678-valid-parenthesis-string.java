class Solution {
    public boolean checkValidString(String s) {
        int currCount = 0, left = 0, right= 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*') currCount++;
            else if (c == '(') left++;
            else right++;
            if (left < right) {
                currCount -= (right-left);
                left = right;
            }
            if (currCount < 0) return false;
            if (i == s.length() - 1 && right >= left && right-left <= currCount) return true;
        }
        return false;
    }
}