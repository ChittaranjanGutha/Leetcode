import java.util.LinkedList;
import java.util.Queue;

public class Pr_226_2 {
	TreeNode root;

	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return null;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			TreeNode copy_Node = node.left;
			node.left = node.right;
			node.right = copy_Node;
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);
		}
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
