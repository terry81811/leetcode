package leetcode;

import utils.TreeNode;

public class E_101_Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSubtreeSym(root.left, root.right);

    }
    
    public boolean isSubtreeSym(TreeNode lc, TreeNode rc) {
        if(lc==null && rc==null) return true;
        else if(lc==null || rc==null) return false;
        else if(lc.val != rc.val)  return false;
        else return isSubtreeSym(lc.left, rc.right) && isSubtreeSym(lc.right, rc.left);
    }
}
