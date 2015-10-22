package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utils.TreeNode;

public class E_107_BinaryTreeLevelOrderTraversal_2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null) return result;
        
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        ArrayList<TreeNode> nextQueue = new ArrayList<TreeNode>();
        queue.add(root);
        
        List<Integer> subresult = new ArrayList<Integer>();
        
        while(!queue.isEmpty() || !nextQueue.isEmpty()) {
            TreeNode t = queue.remove(0);
            subresult.add(t.val);    
            
            if(t.left != null) nextQueue.add(t.left);
            if(t.right != null) nextQueue.add(t.right);
            
            if(queue.isEmpty()) {
                result.add(subresult);
                subresult = new ArrayList<Integer>();
                queue = nextQueue;
                nextQueue = new ArrayList<TreeNode>();
            }
        }
        Collections.reverse(result);
        return result;
    }
}
