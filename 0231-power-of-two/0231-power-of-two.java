class Solution {
    public boolean isPowerOfTwo(int n) {
        int mask = 0x01;
        if (n <= 0) return false;
        while ((n & mask) == 0) {
            n >>= 1;
        }
        return (n ^ 1) == 0;
    }
}