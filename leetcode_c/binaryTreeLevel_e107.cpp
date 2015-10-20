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
    vector<vector<int>> res;
    vector<vector<int>> levelOrderBottom(TreeNode* root) {
        DFS(root,0);
        reverse(res.begin(),res.end());
        return res;
    }
    void DFS( TreeNode* node, int level) {
        if (!node) return;
        if (level==res.size()) 
            res.push_back(vector<int>());
        res[level].push_back(node->val);
        DFS(node->left,level+1);
        DFS(node->right,level+1);
    }
};