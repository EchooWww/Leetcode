class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int [][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) continue;
                int top = m + n, left = m + n;
                if (i > 0) top = res[i-1][j];
                if (j > 0) left = res[i][j-1];
                res[i][j] = Math.min(top,left) + 1;
            }
        }
        for (int i = m-1; i >=0; i--) {
            for (int j = n-1; j >=0; j--) {
                if (mat[i][j] == 0) continue;
                int bottom = m + n, right = m + n;
                if (i < m - 1) bottom = res[i+1][j];
                if (j < n - 1) right = res[i][j+1];
                res[i][j] = Math.min(res[i][j], Math.min(bottom,right) + 1);
            }  
        }
        return res;
    }
}