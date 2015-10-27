package leetcode;

import java.util.ArrayList;
import java.util.List;

import utils.TreeNode;

public class E_102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(root == null) return result;
        List<TreeNode> q = new ArrayList<TreeNode>();
        List<TreeNode> temp = new ArrayList<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        
        q.add(root);
        while(!q.isEmpty() || !temp.isEmpty()) {
            TreeNode tn = q.remove(0);
            list.add(tn.val);
            if(tn.left != null) temp.add(tn.left);
            if(tn.right != null) temp.add(tn.right);
            if(q.isEmpty()){
                q = temp;
                temp = new ArrayList<TreeNode>();
                result.add(list);
                list = new ArrayList<Integer>();
            }
        }
        return result;
        
    }
}
