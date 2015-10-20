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
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> res;
        TreeNode* node=root;
        vector<TreeNode*> temp;
        while (node || !temp.empty()) {
            while(node) {
                temp.push_back(node);
                node = node->left;
            }
            node=temp.back();
            temp.pop_back();
            res.push_back(node->val);
            node= node->right;
        }
        return res;

    }
};