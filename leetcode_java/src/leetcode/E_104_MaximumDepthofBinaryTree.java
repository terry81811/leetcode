package leetcode;

import utils.TreeNode;

public class E_104_MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }else{
            return Math.max(this.maxDepth(root.left), this.maxDepth(root.right))+1;
        }
    }
}
