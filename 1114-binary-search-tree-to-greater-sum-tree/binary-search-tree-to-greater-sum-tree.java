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
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        max(root);
        return root;
    }
    void max(TreeNode root) {
        if(root==null)
        {
            return;
        }
        max(root.right);
        sum = sum+root.val;
        root.val = sum;
        max(root.left);
    }
}