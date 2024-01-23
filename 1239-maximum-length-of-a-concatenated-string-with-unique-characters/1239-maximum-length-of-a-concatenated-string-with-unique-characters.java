class Solution {
    int res = 0;
    public int maxLength(List<String> arr) {
        dfs(arr, "", 0);
        return res;
    }

    void dfs(List<String> arr, String curr, int idx) {
        if (isUniqueString(curr)) {
            res = Math.max(curr.length(), res);
        }
        if (!isUniqueString(curr) || idx == arr.size()) return;
        for (int i = idx; i < arr.size(); i++) dfs(arr, curr + arr.get(i), i + 1);
    }

    boolean isUniqueString(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c: s.toCharArray()) {
            if (freq.getOrDefault(c, 0) == 1) return false;
            freq.put(c, 1);
        }
        return true;
    }
}