/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> res;
    public List<Integer> largestValues(TreeNode root) {
        res = new ArrayList<>();
        dfs(0, root);
        return res;
    }
    void dfs(int depth, TreeNode start) {
        if (start == null) return;
        if (depth == res.size()) {
            res.add(start.val);
        } else {
            res.set(depth, Math.max(res.get(depth), start.val));
        }
        dfs (depth + 1, start.left);
        dfs (depth + 1, start.right);
    }
}