class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        int[] diff = new int[n];
        int remainingSum = 0;
        PriorityQueue<Integer> bigJumps = new PriorityQueue<Integer>();
        diff[0] = 0;
        for (int i = 1; i < n; i++) diff[i] = heights[i] - heights[i-1];
        for (int i = 1; i < n; i++) {
            if (diff[i] > 0) bigJumps.add(diff[i]);
            if (bigJumps.size() > ladders) remainingSum += bigJumps.poll();
            if (remainingSum > bricks) return i-1;
        } 
        return n-1;
    }
}