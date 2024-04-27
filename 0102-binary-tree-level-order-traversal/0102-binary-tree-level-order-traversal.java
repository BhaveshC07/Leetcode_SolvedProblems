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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        
        List<List<Integer>> l1=new ArrayList<>();
        if(root==null){
            return l1;
        }
        lvlOrder(root,l1);
        return l1;
    }
     public static void lvlOrder(TreeNode root,List<List<Integer>> l1){
        Queue<TreeNode> q=new LinkedList<>();            
            q.add(root);
            while (!q.isEmpty()){
            int size = q.size();
            List<Integer> currlvl = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.remove();
                currlvl.add(node.val);
                
                if (node.left != null) {
                    q.add(node.left);
                }
                
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            l1.add(currlvl);
    }
         
}
   // public static List<Integer> list1()
}