class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int res = 0;
        for (int i = 0; i <= k; i++) {
            res += Math.min(tickets[i], tickets[k]);
        }
        for (int i = k + 1; i < tickets.length; i++) {
            res += Math.min(tickets[i], tickets[k] - 1);
        }
        return res;
    }
}