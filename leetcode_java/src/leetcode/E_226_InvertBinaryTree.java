package leetcode;

import utils.TreeNode;

public class E_226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

    if(root != null) {
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);        
        
    }   
    return root;

    }
}
