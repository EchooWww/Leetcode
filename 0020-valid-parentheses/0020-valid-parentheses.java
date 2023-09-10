class Solution {
    public boolean isValid(String s) {

        Stack<Character> left = new Stack<>();

        for (char c: s.toCharArray()) {
            if ( c == '(' || c == '[' || c == '{' ) {
                left.push(c);
            } else if (!left.isEmpty() && left.peek() == leftOf(c)) {
                left.pop();
            } else return false;
        }
        return left.isEmpty();
    }

    public char leftOf (char c) {
        if (c == ']') return '[';
        if (c == ')') return '(';
        else return '{';
    }
}