class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }

    boolean dfs(char[][] board, String word, int x, int y, int currIdx) {
        if (x < 0 || x == board.length || y < 0 || y == board[0].length || board[x][y] != word.charAt(currIdx)) return false;
        if (currIdx == word.length() - 1) return true;
        char temp = board[x][y];
        board[x][y] = ' ';
        boolean res = dfs(board, word, x - 1, y, currIdx + 1) || dfs(board, word, x + 1, y, currIdx + 1) || dfs(board, word, x, y + 1, currIdx + 1) || dfs(board, word, x, y - 1, currIdx + 1);
        board[x][y] = temp;
        return res;
    }
}