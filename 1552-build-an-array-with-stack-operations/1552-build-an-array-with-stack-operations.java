class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int i = 0;
        for (int num: target) {
            while (i < num-1) {
                res.add("Push");
                res.add("Pop");
                i++;
            }
            res.add("Push");
            i++;
        }
        return res;
    }
}