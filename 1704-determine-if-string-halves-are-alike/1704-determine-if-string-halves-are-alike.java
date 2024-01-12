class Solution {
    public boolean halvesAreAlike(String s) {
        String s1 = s.substring(0, s.length()/2), s2 = s.substring(s.length()/2);
        int num1 = 0, num2 = 0;
        String comp = "aeiouAEIOU";
        for(char c: s1.toCharArray()) {
            if (comp.contains(String.valueOf(c))) num1 += 1;
        }
        for(char c: s2.toCharArray()) {
            if (comp.contains(String.valueOf(c))) num2 += 1;
        }
        return num1 == num2;
    }
}