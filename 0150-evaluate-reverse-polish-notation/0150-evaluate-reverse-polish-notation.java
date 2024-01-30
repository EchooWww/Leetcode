class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operands= new Stack<>();
        for (String s: tokens) {
            if (s.length() == 1 && s.charAt(0) < '0') {
                int num2 = Integer.valueOf(operands.pop());
                int num1 = Integer.valueOf(operands.pop());
                char operator = s.charAt(0);
                operands.push(calculate(num1, num2, operator));
            } else operands.push(Integer.valueOf(s));
        }
        return operands.pop();
    }

    public int calculate(int a, int b, char operator) {
        if (operator == '+') return a + b;
        if (operator == '-') return a - b;
        if (operator == '*') return a * b;
        return a / b;
    }
}