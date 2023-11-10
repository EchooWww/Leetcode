/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

void sort (int * nums, int lo, int hi) {
    if (lo >= hi) return;
    int i = lo, j = hi, m = nums[lo+(hi-lo)/2];
    while(i <= j) {
        while (nums[i] < m) i++;
        while (nums[j] > m) j--;
        if (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    sort(nums, lo, j);
    sort(nums, i, hi);
}

int* sortArray(int* nums, int numsSize, int* returnSize) {
    *returnSize = numsSize;
    sort(nums, 0, numsSize - 1);
    return nums;
}