# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isFlipped(self, p:Optional[TreeNode], q:Optional[TreeNode]):
        if p is None or q is None:
            return p == q
        return self.isFlipped(p.left, q.right) and self.isFlipped(p.right, q.left) and p.val == q.val
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        return self.isFlipped(root.left, root.right)
        
        