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
    int kthSmallest(TreeNode* root, int k) {
        if (k==0)
            return root->val;
        int count = countNode(root->left);
        if (count < k) {
            if (count==k-1)
                return root->val;
            return kthSmallest(root->right,k-count-1);
        }
        // else if (count==k)
        //     return root->left->val;
        else
            return kthSmallest(root->left,k);
    }
    int countNode(TreeNode* root) {
        if (!root)
            return 0;
        else
            return countNode(root->left) + countNode(root->right) +1;
    }
};