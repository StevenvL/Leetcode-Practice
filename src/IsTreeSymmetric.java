
public class IsTreeSymmetric {
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return checkLeftRight(root.left, root.right);
	}

	public boolean checkLeftRight(TreeNode left, TreeNode right) {
		if (left == null || right == null)
			return left == right;
		if(left.val != right.val)
			return false;
		return checkLeftRight(left.left, right.right) && checkLeftRight(left.right, right.left);
	}
}
