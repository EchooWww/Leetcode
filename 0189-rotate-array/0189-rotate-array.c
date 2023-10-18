void reverse (int * nums, int size) {
    for (int i = 0; i < size/2; i++) {
        int temp = nums[i];
        nums[i] = nums[size - i - 1];
        nums[size - i - 1] = temp;
    }
}

void rotate(int* nums, int numsSize, int k){
    if (numsSize == 1) return;
    if (k > numsSize) return rotate(nums, numsSize, k%numsSize);
    reverse(nums, numsSize - k);
    reverse(nums + numsSize - k, k);
    reverse(nums, numsSize);
}