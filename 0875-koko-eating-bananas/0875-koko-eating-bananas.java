class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        int lo = 1;
        int hi = piles[n-1];
        while(hi>=lo) {
            int mid = lo + (hi-lo) / 2;
            if (getHour(piles, mid) > h) lo = mid + 1;
            else if (getHour(piles, mid) <= h) hi = mid - 1;
        }
        return lo;
    }

    public int getHour(int[] piles, int speed) {
        int hours= 0;
        for(int pile:piles) {
            hours += Math.ceil((double)pile/speed);
        }
        return hours;
    }
}