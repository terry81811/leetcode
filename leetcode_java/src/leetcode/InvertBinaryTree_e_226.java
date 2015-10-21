package leetcode;

import utils.TreeNode;

public class InvertBinaryTree_e_226 {
    public TreeNode invertTree(TreeNode root) {

    if(root != null) {
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);        
        
    }   
    return root;

    }
}
