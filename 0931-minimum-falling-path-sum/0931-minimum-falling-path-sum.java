class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] min = new int[n][n];
        for(int i = 0; i < n; i++) min[0][i] = matrix[0][i];
        for(int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0 && j < n-1) min[i][j] = Math.min(min[i-1][j], Math.min(min[i-1][j-1], min[i-1][j+1])) + matrix[i][j];
                else if (j == 0) min[i][j] =  Math.min(min[i-1][j], min[i-1][j+1])+ matrix[i][j];
                else min[i][j] =  Math.min(min[i-1][j], min[i-1][j-1])+ matrix[i][j];
            }
        }
        int res = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
             if (min[n-1][j] < res) res = min[n-1][j];
        }
        return res;
    }
}