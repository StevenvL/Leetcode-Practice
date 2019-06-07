
public class UnivalueBinaryTree {
	    public boolean isUnivalTree(TreeNode root) {
	    		return inOrderSearch(root,root.val);
	    }
	    public boolean inOrderSearch (TreeNode root, int topVal) {
	    	if(root == null)
	    		return true;
	    	if(root.val != topVal)
	    		return false;
	    	else
	    		return(inOrderSearch(root.left,root.val) && inOrderSearch(root.right,root.val));
	    }
}
