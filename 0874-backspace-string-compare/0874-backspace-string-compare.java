class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        int numBack1 = 0;
        int numBack2 = 0;
        for(int i = s.length() - 1; i >=0; i--) {
            if (s.charAt(i) == '#') {
                numBack1++;
                continue;
            }
            if (s.charAt(i) != '#' && numBack1 == 0) s1.append(s.charAt(i));
            else if (s.charAt(i) != '#' && numBack1 > 0) numBack1--;
        }
        for(int i = t.length() - 1; i >=0; i--) {
            if (t.charAt(i) == '#') {
                numBack2++;
                continue;
            }
            if (t.charAt(i) != '#' && numBack2 == 0) s2.append(t.charAt(i));
            else if (t.charAt(i) != '#' && numBack2 > 0) numBack2--;
        }
        return s1.toString().equals(s2.toString());
    }
}