class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] prev = new int[n];
        int[] size = new int[n];
        int maxIndex = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            size[i] = 1;
            prev[i] = -1;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    if (size[i] < size[j] + 1) {
                        size[i] = size[j] + 1;
                        prev[i] = j;
                    }
                }
            }
            if (size[i] > size[maxIndex]) maxIndex = i;
        }

        List<Integer> res = new ArrayList<>();
        while (maxIndex != -1) {
            res.add(0, nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }
        return res;
    }
}