/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    void flatten(TreeNode* root) {
        TreeNode* trans = root;
        if (!root) return;
        while (trans) {
            if (trans->left) {
                TreeNode* temp = trans->left;
                while (temp->right) {
                    temp = temp->right;
                }
                temp->right = trans->right;
                trans->right = trans->left;
                trans->left = NULL;
            }
            trans = trans->right;
        }
    }
};