/**
 * Given two binary trees and imagine that when you put one of them to cover the
 * other, some nodes of the two trees are overlapped while the others are not.
 * 
 * You need to merge them into a new binary tree. The merge rule is that if two
 * nodes overlap, then sum node values up as the new value of the merged node.
 * Otherwise, the NOT null node will be used as the node of new tree.
 * 
 * Example 1:
 * 
 * Input: Tree 1 Tree 2 1 2 / \ / \ 3 2 1 3 / \ \ 5 4 7 Output: Merged tree: 3 /
 * \ 4 5 / \ \ 5 4 7
 *
 */
public class MergeTwoBinaryTrees {
	TreeNode result;

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null)
			return null;
		result = new TreeNode(t1.val + t2.val);
		return traverse(result,t1, t2);
	}

	public TreeNode traverse(TreeNode result, TreeNode t1, TreeNode t2) {
		if (t1 != null && t2 != null)
			result.val = t1.val + t2.val;
		if(t1 != null && t2 == null)
			result.val = t1.val;
		if(t1 == null && t2 != null)
			result.val = t2.val;
		traverse(result.left,t1.left,t2.left);
		traverse(result.right,t1.right,t2.right);
	
		return result;
	}
}
