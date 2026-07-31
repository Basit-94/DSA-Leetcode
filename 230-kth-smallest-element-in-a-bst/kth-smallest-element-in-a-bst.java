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
    int k;
    int counter;
    int result;
    boolean found;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;

        recurse(root);
        return result;
    }
    private void recurse(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        if(found)
        {
            return;
        }

        recurse(root.left);
        counter++;
        if(k==counter)
        {
            result = root.val;
            found = true;
            return;
        }
        recurse(root.right);
    }
}