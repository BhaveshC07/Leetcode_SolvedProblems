/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int solver(TreeNode*root){
        if(!root) return 0;
        if(!root->left && !root->right){
            return 1;
        }
        int lh = 1 + solver(root->left);
        int rh = 1 +  solver(root->right);
        if(lh==1 ){
            return rh;
        }
        if(rh==1 ){
            return lh;
        }
        
        return min(lh,rh);
    }
    int minDepth(TreeNode* root) {
        if(!root) return 0;
        return solver(root);
    }
};