/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int l = 0, r = mountainArr.length() - 1;
        int maxIdx = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mountainArr.get(mid + 1) > mountainArr.get(mid)) l = mid + 1;
            else r = mid - 1;
            maxIdx = mid;
        }
        
        int l1 = 0, r1 = maxIdx;
        while (l1 <= r1) {
            int mid = l1 + (r1 - l1) / 2;
            if (mountainArr.get(mid) == target) return mid;
            if (mountainArr.get(mid) < target) l1 = mid + 1;
            else r1 = mid - 1;
        }
        int l2 = maxIdx, r2 = mountainArr.length() - 1;
        while (l2 <= r2) {
            int mid = l2 + (r2 - l2) / 2;
            if (mountainArr.get(mid) == target) return mid;
            if (mountainArr.get(mid) > target) l2 = mid + 1;
            else r2 = mid - 1;
        }
    return -1;
    }
}