
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Pr_226 {
	TreeNode root;

	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return null;
		TreeNode left = root.left;
		TreeNode right = root.right;
		root.left = invertTree(right);
		root.right = invertTree(left);
		return root;

	}

	public static void main(String[] args) {
		Pr_226 obj = new Pr_226();
		obj.root = new TreeNode(1);
		obj.root.left = new TreeNode(2);
		obj.root.right = new TreeNode(3);
		obj.root.left.left = new TreeNode(4);
		obj.root.left.right = new TreeNode(5);
		TreeNode root = obj.invertTree(obj.root);
	}

}
