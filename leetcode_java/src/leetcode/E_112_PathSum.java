package leetcode;

import utils.TreeNode;

public class E_112_PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        else return hasPathSum2(root, sum);
    }
    
    public boolean hasPathSum2(TreeNode root, int sum) {
        if(root == null && sum != 0) return false;
        if(root == null && sum == 0) return true;
        if(root.left != null && root.right != null) {
            return hasPathSum2(root.left, sum-root.val) || hasPathSum2(root.right, sum-root.val);
        }
        else if(root.left != null) return hasPathSum2(root.left, sum-root.val);
        else if(root.right != null) return hasPathSum2(root.right, sum-root.val);
        else return sum == root.val;
    }
}
