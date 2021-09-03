import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> rightSideView(TreeNode root) {
		if (root == null)
			return new LinkedList<Integer>();
		List<Integer> res = new LinkedList<Integer>();
		// BFS(root, res);
		DFS(root, 1, res);
		return res;
	}

	private void DFS(TreeNode root, int level, List<Integer> res) {
		if (root == null)
			return;
		if (res.size() < level) {
			res.add(root.val);
		}
		DFS(root.right, level + 1, res);
		DFS(root.left, level + 1, res);
	}

	private void BFS(TreeNode root, List<Integer> res) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode curr;
		int count = 1;
		queue.add(root);
		while (!queue.isEmpty()) {
			res.add(queue.peek().val);
			while (count > 0) {
				curr = queue.remove();
				if (curr.right != null)
					queue.add(curr.right);
				if (curr.left != null)
					queue.add(curr.left);
				count--;
			}
			count = queue.size();
		}
	}

}
