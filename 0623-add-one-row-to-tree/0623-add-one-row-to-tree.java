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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        root.left = helper(root.left, val, depth - 1, 'l');
        root.right = helper(root.right, val, depth - 1, 'r');
        return root;
    }

    TreeNode helper(TreeNode root, int val, int depth, char subtree) {
        if (root == null && depth != 1) return root;
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            if (subtree == 'l') newRoot.left = root;
            else newRoot.right = root;
            return newRoot;
        }
        root.left = helper(root.left, val, depth - 1, 'l');
        root.right = helper(root.right, val, depth - 1, 'r');
        return root;
    }
}