
public class CountNodesCT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int countNodes(TreeNode root) {
		if (root == null)
			return 0;
		int height = getTreeHeight(root);
		int start = 0, end = (int) Math.pow(2, height - 1) - 1;
		int mid = 0;
		while (start < end) {
			mid = (int) Math.ceil((start + end) / 2.0);
			if (ifExistsAtLastLevel(root, height, mid)) {
				start = mid;
			} else {
				end = mid - 1;
			}
		}
		return (int) Math.pow(2, height - 1) + start;
	}

	private int getTreeHeight(TreeNode root) {
		int height = 1;
		TreeNode curr = root;
		while (curr.left != null) {
			height++;
			curr = curr.left;
		}
		return height;
	}

	private boolean ifExistsAtLastLevel(TreeNode root, int height, int index) {
		int start = 0, end = (int) Math.pow(2, height - 1) - 1;
		TreeNode curr = root;
		while (start < end) {
			int mid = (int) Math.ceil((start + end) / 2.0);
			if (index >= mid) {
				start = mid;
				curr = curr.right;
			} else {
				end = mid - 1;
				curr = curr.left;
			}
		}
		if (curr != null)
			return true;
		return false;
	}

}
