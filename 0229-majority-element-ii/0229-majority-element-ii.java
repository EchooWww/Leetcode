class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> res = new ArrayList<>();

        if (n < 3) {
            for (int k: nums) {
                if (!res.contains(k)) res.add(k);
            }
            return res;
        }
        int freq = 1;
        for(int i = 1; i < n; i++) {
            while (i < n && nums[i] == nums[i-1]) {
                freq++;
                i++;
            }
            if (freq > n/3) res.add(nums[i-1]);
            freq = 1;
        }
        return res;
    }
}