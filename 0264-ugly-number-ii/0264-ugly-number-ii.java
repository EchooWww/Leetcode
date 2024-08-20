class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> nums = new PriorityQueue<>();
        nums.add(1L);
        nums.add(2l);
        nums.add(3l);
        nums.add(5l);
        for (int i = 0; i < n; i++) {
            long curr = nums.poll();
            if (i == n-1) return (int)curr;
            long[] multiples = {curr * 2, curr * 3, curr * 5};
            for (long num: multiples) {
                if (!nums.contains(num)) nums.add(num);
            }
        }
        return 0;
    }
}