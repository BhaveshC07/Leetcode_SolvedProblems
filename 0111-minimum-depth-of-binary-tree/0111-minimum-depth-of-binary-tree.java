/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int count = 0;
    int ans = Integer.MAX_VALUE;

    public void mins(TreeNode root) {
        if (root == null) {
            return;
        }
        count++;
        if (root.left==null && root.right==null) {
            ans=Math.min(ans, count);
        }
        mins(root.left);
        mins(root.right);
        count--;
    }

    public int minDepth(TreeNode root) {
        if(root==null) {
            return 0;
        }
        mins(root);
        return ans;
    }
}
