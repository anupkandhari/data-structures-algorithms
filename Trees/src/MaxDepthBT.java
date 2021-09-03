
public class MaxDepthBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;        
        else
            return 1 + Math.max(maxDepth(root.left),maxDepth(root.right) );
    }


}
