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
    int currVal;
    int currCnt = 0;
    int maxCnt = 0;;
    List<Integer> modes = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        currVal = root.val;
        traverse(root);
        int[] res = new int[modes.size()];
        for(int i = 0; i < modes.size(); i++) {
            res[i] = modes.get(i);
        }
        return res;
    }

    public void traverse(TreeNode root) {
        if (root == null) return;
        traverse(root.left);
        currCnt = (currVal == root.val? currCnt + 1: 1);
        currVal = root.val;
        if (currCnt == maxCnt) {
            modes.add(currVal);
        } else if (currCnt > maxCnt) {
            modes.clear();
            modes.add(currVal);
            maxCnt = currCnt;
        }
        traverse(root.right);
    }
}