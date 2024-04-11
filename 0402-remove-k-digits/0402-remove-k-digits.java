class Solution {
    public String removeKdigits(String num, int k) {
        int resLen = num.length() - k;
        Stack<Character> digits = new Stack<>();
        StringBuilder res = new StringBuilder();
        for (char digit: num.toCharArray()) {
            while (k > 0 && !digits.isEmpty() && digit - '0' < digits.peek() - '0') {
                digits.pop();
                k--;
            }
            digits.push(digit);
        }
        while (!digits.isEmpty()) res.insert(0, digits.pop());
        int i = 0;
        while (i < resLen && res.charAt(i) == '0') i++;
        return i == resLen? "0" : res.toString().substring(i, resLen);
    }
}