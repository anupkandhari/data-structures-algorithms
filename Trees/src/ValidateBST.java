
public class ValidateBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValidBST(TreeNode root) {
		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private boolean isValidBST(TreeNode root, long min, long max) {
		if (root.val <= min || root.val >= max)
			return false;
		if (root.left != null) {
			if (!isValidBST(root.left, min, root.val))
				return false;
		}
		if (root.right != null) {
			if (!isValidBST(root.right, root.val, max))
				return false;
		}
		return true;
	}

}
