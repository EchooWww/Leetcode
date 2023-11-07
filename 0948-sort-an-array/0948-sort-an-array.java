class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int[] aux = new int[n];
        System.arraycopy(nums, 0, aux, 0, n);
        sortArray(aux, nums, 0, n-1);
        return nums;
    }

    public void sortArray(int[] aux, int[] org, int lo, int hi) {
        if (lo >= hi) return;
        int mid = lo + (hi-lo) / 2;
        sortArray(org, aux, lo, mid);  // Swap org and aux here
        sortArray(org, aux, mid+1, hi);  // Swap org and aux here
        merge(aux, org, lo, mid, hi);  // Swap aux and org here
    }

    public void merge(int[] aux, int[] org, int lo, int mid, int hi) {
        int m = lo;
        int n = mid + 1;
        for(int i = lo; i <= hi; i++) {
            if (n > hi) org[i] = aux[m++];
            else if (m > mid) org[i] = aux[n++];
            else if (aux[m] <= aux[n]) org[i] = aux[m++];
            else org[i] = aux[n++];
        }
    }
}
