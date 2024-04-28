/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lca(root,p.val,q.val);
    }
    
    public static TreeNode lca(TreeNode root, int n1,int n2){
        if(root==null || root.val==n1 || root.val==n2){
            return root;
        }
        
        
        TreeNode leftlca=lca(root.left, n1,n2);
        TreeNode rightlca=lca(root.right, n1, n2);
        
        if(leftlca==null){
            return rightlca;
        }
        if(rightlca==null){
            return leftlca;
        }
        return root;
    }
}