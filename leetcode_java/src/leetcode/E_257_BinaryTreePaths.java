package leetcode;

import java.util.ArrayList;
import java.util.List;

import utils.TreeNode;

//also not that when a root has a leaf, the other side is not considered a leaf

public class E_257_BinaryTreePaths {
	public List<String> binaryTreePaths (TreeNode root) {
		
		
				//base case
		if(root == null) {
			ArrayList<String> list = new ArrayList<String>();
			return list;
		}else if(root.left == null && root.right == null) {
			ArrayList<String> list = new ArrayList<String>();
			String str = root.val+"";
			list.add(str);
			return list;
		}else{
			ArrayList<String> list = new ArrayList<String>();
			
			if(root.left != null) {
					ArrayList<String> leftPaths = (ArrayList<String>) binaryTreePaths(root.left);
					for(String path: leftPaths) {
						if(path == "") {
							String str = root.val+"";
							list.add(str);
					}else {
						String str = root.val + "->" + path;
						list.add(str);
					}
				}
			}	
			if(root.right != null) {
				ArrayList<String> rightPaths = (ArrayList<String>) binaryTreePaths(root.right);
				for(String path: rightPaths) {
					if(path == "") {
						String str = root.val+"";
						list.add(str);
					}else {
							String str = root.val + "->" + path;
							list.add(str);
					}
				}	
			}
			return list;
		}
	}
}


