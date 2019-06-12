package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class InOrderRecursive {
	public static List<Integer> preorderTraversal(TreeNode root) {
	List<Integer> result = new ArrayList<Integer>();
	preOrderTraverse(root, result);
	return result;
	}
	
	public static void preOrderTraverse(TreeNode root, List<Integer> result) {
		if(root == null)
			return;
		preOrderTraverse(root.left, result);
		result.add(root.val);
		preOrderTraverse(root.right,result);
	}
}
