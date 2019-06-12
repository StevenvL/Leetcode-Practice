package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderRecurisve {
	public static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		preOrderTravel(root, result);
		return result;
	}

	public static void preOrderTravel(TreeNode root, List<Integer> result) {
		if (root == null)
			return;
		result.add(root.val);
		preOrderTravel(root.left, result);
		preOrderTravel(root.right, result);
	}
}
