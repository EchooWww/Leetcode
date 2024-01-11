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
    public int maxAncestorDiff(TreeNode root) {
        int[] res = {0};
        dfs(root, res);
        return res[0];
    }

    // definition of dfs function: return an int array, 1st elem being the minimum value in the tree starting from root, 2nd elem being the maximum value in the tree
    public int[] dfs(TreeNode root, int[] res) {
        if (root == null) return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};

        // get values from left and right subtree
        int[] left = dfs(root.left, res);
        int[] right = dfs(root.right, res);
        
        // get minimum and maximum value for the whole tree
        int min = Math.min(root.val, Math.min(left[0], right[0]));
        int max = Math.max(root.val, Math.max(left[1], right[1]));

        // update maximum difference
        res[0] = Math.max(res[0], Math.max(root.val - min, max - root.val));

        // return the array
        return new int[]{min, max};
    }
}