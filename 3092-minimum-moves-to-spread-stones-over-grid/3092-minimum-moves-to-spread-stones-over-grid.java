class Solution {
    public int solve (int empty, int[][] grid) {
        if (empty == 0) return 0;
        
        int steps = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j]==0) {
                    for (int p = 0; p < 3; p++) {
                        for (int q = 0; q < 3; q++) {
                            if (grid[p][q] > 1) {
                                grid[p][q]--;
                                grid[i][j] = 1;
                                steps = Math.min(Math.abs(p-i) + Math.abs(q-j) + solve(empty-1, grid), steps);
                                grid[i][j] = 0;
                                grid[p][q]++;
                            }
                        }
                    }
                }
            }
        }
        return steps;
    }
    
    public int minimumMoves(int[][] grid) {
        int empty = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == 0) empty++;
            }
        }
        return solve(empty, grid);
    }
}