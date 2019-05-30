
public class RangeOfBST {
	/**
	 * Given the root node of a binary search tree, return the sum of values of all
	 * nodes with value between L and R (inclusive).
	 * 
	 * The binary search tree is guaranteed to have unique values.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: root = [10,5,15,3,7,null,18], L = 7, R = 15 Output: 32 Example 2:
	 * 
	 * Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10 Output: 23
	 * 
	 * 
	 * since its BST
	 *if LR is less than root you would only need to check the left side
	 *if LR is greater than root you only need to check right side
	 *otherwise worst case scenario?
	 *  if (root == null) return 0; // base case.
        if (root.val < L) return rangeSumBST(root.right, L, R); // left branch excluded.
        if (root.val > R) return rangeSumBST(root.left, L, R); // right branch excluded.
        return root.val + rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R); // count in both children.
    }
	 */
	int total = 0;
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int rangeSumBST(TreeNode root, int L, int R) {
		return inOrderSearch(root,L,R);
	}
	
	public int inOrderSearch(TreeNode root, int L, int R) {
        if(root != null) {
		    if(root.val >= L && root.val <= R)
                total += root.val;
		    inOrderSearch(root.left,L,R);
		    inOrderSearch(root.right,L,R);
            }
 
		return total;
	}
}
