class Solution {
    List<String> res = new LinkedList<>();
    String[] map= new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return res;
        backtrack(digits, 0, new StringBuilder());
        return res;
    }
    void backtrack (String digits, int start, StringBuilder sb) {
        if(sb.length()==digits.length()) {
            res.add(sb.toString());
            return;
        }
        for (int i = start; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            for (char c: map[digit].toCharArray()) {
                sb.append(c);
                backtrack(digits, i + 1, sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}