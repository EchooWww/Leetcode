class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int res2 = 0;
        Set<Integer> uniques = new HashSet<>();
        int[] res = new int[2];
        for(int num: nums) {
            if(!uniques.add(num)) {
            res[0] = num;
            }
         }
        for (int i = 1; i <= n; i++) {
            res2 ^= i;
        }
        for (int num: uniques) res2 ^= num;
        res[1] = res2;
        return res;
    }
}
