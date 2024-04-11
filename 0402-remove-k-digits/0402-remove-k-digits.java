class Solution {
    public String removeKdigits(String num, int k) {
        int resLen = num.length() - k;
        if (num.length() == k) return "0";
        Stack<Character> digits = new Stack<>();
        StringBuilder res = new StringBuilder();
        for (char digit: num.toCharArray()) {
            while (k > 0 && !digits.isEmpty() && digit - '0' < digits.peek() - '0') {
                digits.pop();
                k--;
            }
            digits.push(digit);
        }
        Stack<Character> auxiliry= new Stack<>();
        while (!digits.isEmpty()) auxiliry.push(digits.pop());
        while (!auxiliry.isEmpty()) res.append(auxiliry.pop());
        return res.toString().substring(0, resLen).replaceFirst("^0+(?!$)", "");
    }
}