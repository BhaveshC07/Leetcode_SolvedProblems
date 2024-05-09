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
    int result=Integer.MIN_VALUE;
    public int maxSumBST(TreeNode root) {
        isValid(root);
     return result<0?0:result;
    }
    public int[] isValid(TreeNode root){
        if(root==null){
            return new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE,0};
        }
        
       int[] left= isValid(root.left);
       int[] right= isValid(root.right);
        
        
        if(left[1]>=root.val || right[0]<=root.val){
            return new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE,0};
        }
        
        
        int sum=left[2]+root.val+right[2];
        
         result=Math.max(sum,result);
        return new int[] {Math.min(root.val,left[0]),Math.max(root.val,right[1]),sum};
    }
}