
void reverseArray(int *nums, int start, int end) {
    if (start >= end) return;
    int temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
    reverseArray(nums, start + 1, end - 1);
}

void rotate(int* nums, int numsSize, int k){
    k = k % numsSize;
    reverseArray(nums, 0, numsSize - k - 1);
    reverseArray(nums, numsSize - k, numsSize-1);
    reverseArray(nums, 0, numsSize-1);
}
