package leetcode;

import utils.TreeNode;

public class LowestCommonAncestorOfABinarySearchTree_e_235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null) {
            return null;
        }else if(p.val<root.val && q.val<root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }else if(p.val>root.val && q.val>root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
        
 }
}
