class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int states = minutesToTest/minutesToDie + 1;
        int res = 0;
        while (Math.pow(states, res) < buckets) res++;
        return res;
    }
}