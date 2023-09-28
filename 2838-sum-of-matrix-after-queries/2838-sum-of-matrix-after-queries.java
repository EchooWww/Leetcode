class Solution {
    public long matrixSumQueries(int n, int[][] queries) {
        long ans = 0;
        char[] rows = new char[n], cols = new char[n];
        int rowCnt = n, colCnt = n;
        for (int i = queries.length-1; i >= 0; i--) {
            if (queries[i][0] == 0) {
                int row = queries[i][1]; 
                if (rows[row] == 'o') continue;
                rows[row] = 'o';
                rowCnt--;
                ans += colCnt * queries[i][2];
                } else {
                    int col = queries[i][1];
                    if (cols[col] == 'o') continue;
                    cols[col] = 'o';
                    colCnt--;
                    ans += rowCnt * queries[i][2];
                }
            }
            return ans;
        }
    }
