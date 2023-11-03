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
    int nodesinTree(TreeNode root) {
        if (root == null) return 0;
        return nodesinTree(root.left) + nodesinTree(root.right) + 1;
    }

    int sumOfTree(TreeNode root) {
        if (root == null) return 0;
        return sumOfTree(root.left) + sumOfTree(root.right) + root.val;
    }


    public int averageOfSubtree(TreeNode root){
        if (root == null) return 0;
        return averageOfSubtree(root.left) + averageOfSubtree(root.right) + (sumOfTree(root)/ nodesinTree(root) == root.val? 1: 0) ;
    }
}