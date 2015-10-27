package leetcode;

import utils.TreeNode;

public class E_111_MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        else if(root.right ==null && root.left!=null) {
            return minDepth(root.left) +1;
        }
        else if(root.left ==null && root.right!=null) {
            return minDepth(root.right) +1;
        }
        else return(Math.min(minDepth(root.left), minDepth(root.right))+1);
    }
}

//notice that when a node has one child, 
//the other non-child is not a leave (which height should not be consider zero)