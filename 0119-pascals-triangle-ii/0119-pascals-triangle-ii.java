class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[][] nums = new int[rowIndex+1][rowIndex+1];
        if (rowIndex == 0) return new ArrayList<>(Arrays.asList(1));
        for (int i = 0; i < rowIndex + 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) nums[i][j] = 1;
                else nums[i][j] = nums[i-1][j-1] + nums[i-1][j];
            }
        }
        List <Integer> res = new ArrayList<>();
        for(int n: nums[rowIndex]) res.add(n);
        return res;
    }
}