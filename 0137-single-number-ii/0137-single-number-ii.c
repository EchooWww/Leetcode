int singleNumber(int* nums, int numsSize) {
    uint32_t res = 0;
    for (int i = 0; i < 32; i++) {
        int count1 = 0;
        for (int j = 0; j < numsSize; j++) {
            count1 += nums[j]>>i & 1;
        }
        res |= count1 % 3U << i;
    }
    return res;
}