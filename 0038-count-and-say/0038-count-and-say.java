class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String count = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count.length(); i++) {
            char c = count.charAt(i);
            int freq = 1;
            while (i < count.length() -1 && count.charAt(i+1) == c) {
                freq++;
                i++;
            }
            sb.append(Character.forDigit(freq, 10));
            sb.append(c);
        } 
        return sb.toString();  
    }
}