class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> res = new ArrayList<>();

        int freq = 0;
        int curr = nums[0];
        for(int num: nums) {
            if (num == curr) freq ++;
            else {
                curr = num;
                freq = 1;
            }
            if (freq > n/3 && !res.contains(num)) res.add(num);
        }
        return res;
    }
}