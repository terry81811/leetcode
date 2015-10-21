package leetcode;

import utils.TreeNode;

public class E_110_BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(height(root.right) - height(root.left))>1) return false;
        else {
            return isBalanced(root.left) && isBalanced(root.right);            
        }
    }
    
    public int height(TreeNode root) {
        if(root == null) return 0;
        else return 1+ Math.max(height(root.right), height(root.left));
    }
}
