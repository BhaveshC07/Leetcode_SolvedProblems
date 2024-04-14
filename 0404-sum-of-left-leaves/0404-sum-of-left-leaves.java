
class Solution {

    static int res;

    public int sumOfLeftLeaves(TreeNode root) {
        res = 0;

        recursive(root, false);

        return res;
    }

    public void recursive(TreeNode node, boolean isLeft) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            if (isLeft) {
                res += node.val;
            }
            return;
        }
        recursive(node.left, true);
        recursive(node.right, false);
    }
}