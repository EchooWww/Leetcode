class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if (sx==fx && sy==fy) return t!=1;
        int min = Math.min(Math.abs(fx-sx), Math.abs(fy-sy)) + Math.abs(Math.abs(fx-sx)-Math.abs(fy-sy));
        return t >= min;
    }
}