class Solution {
    public int maxDepth(String s) {
        int maxDepth = Integer.MIN_VALUE, depth = 0;
        Stack<Character> parentheses = new Stack<>();
        for(char c: s.toCharArray()) {
            if (c == '(') {
                parentheses.push(c);
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            }
            if (c == ')') {
                parentheses.pop();
                depth--;
            }
        }
        return maxDepth == Integer.MIN_VALUE? 0 : maxDepth;
    }
}