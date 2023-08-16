class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 1) return nums;
        // A double linkedlist to store the index of current maximum value
        LinkedList<Integer> window = new LinkedList<>();
        int n = nums.length;
        // A int array to store the result
        int[] res = new int[n-k+1];

        for(int i = 0; i < nums.length; i++) {
            // Guarentee there's no smaller value before the current element in the window, i.e., make it a descending window
            while (!window.isEmpty() && nums[i]>nums[window.getLast()]) {
                window.pollLast();
            }
            window.addLast(i);
            // Delete elements not in the window anymore
            if(window.getFirst() == i-k){
                window.pollFirst();
            }
            // add max to the result
            if (i >= k-1) {
                res[i-k+1] = nums[window.getFirst()];
            }
        }
        return res;
    }
}