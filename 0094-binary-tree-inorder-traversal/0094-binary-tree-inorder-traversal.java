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
    public List<Integer> inorderTraversal(TreeNode root) {
       ArrayList<Integer> l1=new ArrayList<>();
        if(root == null){
            return l1;
        }
        
        inorder(root,l1);
        return l1;
    }
    
    public static void inorder(TreeNode root,ArrayList<Integer> l1){
        if(root==null){
            return;
        }
        
        inorder(root.left,l1);
        l1.add(root.val);
        inorder(root.right,l1);
    }
}