# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def getDepth(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        return max(self.getDepth(root.left), self.getDepth(root.right)) + 1
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if root is None:
             return True
        return self.isBalanced(root.left) and self.isBalanced(root.right) and abs(self.getDepth(root.left) - self.getDepth(root.right)) <= 1
        