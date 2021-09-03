import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null)
			return new ArrayList<List<Integer>>();
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode curr = root;
		queue.add(curr);
		int count = 1;
		while (count > 0) {
			List<Integer> list = new ArrayList<Integer>();
			while (count > 0) {
				curr = queue.remove();
				if (curr.left != null)
					queue.add(curr.left);
				if (curr.right != null)
					queue.add(curr.right);
				list.add(curr.val);
				count--;
			}
			res.add(list);
			count = queue.size();
		}
		return res;
	}

}
