import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        int resLen = num.length() - k;        
        Stack<Character> digits = new Stack<>();
        int validDigitsStartIndex = 0;
        
        for (char digit: num.toCharArray()) {
            while (k > 0 && !digits.isEmpty() && digit < digits.peek()) {
                digits.pop();
                k--;
            }
            digits.push(digit);
        }
        
        char[] resArr = new char[digits.size()];
        int index = digits.size() - 1;
        while (!digits.isEmpty()) {
            resArr[index--] = digits.pop();
        }
        
        while (validDigitsStartIndex < resArr.length && resArr[validDigitsStartIndex] == '0') {
            validDigitsStartIndex++;
        }
        if (validDigitsStartIndex >= resLen) return "0";
        
        return new String(resArr, 0, resLen).substring(validDigitsStartIndex);
    }
}
