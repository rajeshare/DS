import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

class TreeNode {
	int data;
	TreeNode left, right;
	boolean vis = false;

	TreeNode(int data) {

		this.data = data;
		left = right = null;

	}
}

public class BinaryTree {

	TreeNode root;

	BinaryTree() {
		root = null;
	}

	public BinaryTree(int data) {
		root = new TreeNode(data);
	}

	public static void main(String[] arg) {
		BinaryTree tree = new BinaryTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);

		System.out.println("In order");

		tree.inorder(tree.root);

		System.out.println("Preorder");

		tree.preorder(tree.root);

		System.out.println("Post order");

		tree.preorder(tree.root);

		System.out.println(tree.isMirror(tree.root, tree.root));
		System.out.println(tree.isSame(tree.root, tree.root));
		tree.printAllNodesInTree(tree.root);
		System.out.println("preOrder iteration");
		tree.preOrderIteration(tree.root);
		System.out.println("postOrder iteration");
		tree.postOrderIteration(tree.root);

	}

	public void printAllNodesInTree(TreeNode root) {

		if (root == null) {
			return;
		}
		Queue<TreeNode> q = new LinkedBlockingQueue<TreeNode>();
		TreeNode cur = root;
		q.add(cur);
		while (q != null && q.size() > 0) {
			cur = q.poll();
			System.out.println(cur.data);
			if (cur.left != null) {
				q.add(cur.left);
			}
			if (cur.right != null) {
				q.add(cur.right);
			}
		}
	}

	private static void inorder(TreeNode root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}

	public void preorder(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);

	}

	public void preOrderIteration(TreeNode root) {

		if (root == null) {
			return;
		}
		Stack<TreeNode> q = new Stack<TreeNode>();
		TreeNode cur = root;
		q.add(cur);
		while (q != null && q.size() > 0) {
			cur = q.pop();
			System.out.println(cur.data);
			if (cur.right != null) {
				q.push(cur.right);
			}
			if (cur.left != null) {
				q.push(cur.left);
			}
		}
	}

	private static void postorder(TreeNode root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}

	public void postOrderIteration(TreeNode root) {
		if (root == null) {
			return;
		}
		Stack<TreeNode> q = new Stack<TreeNode>();
		TreeNode cur = root;
		q.add(cur);
		TreeNode prev = null;
		while (q != null && q.size() > 0) {
			TreeNode top = q.peek();
			if ((top.left != null || top.right != null)&&!top.vis) {
				
				top.vis=true;
				if (top.right != null) {
					q.push(top.right);
				}
				if (top.left != null) {
					q.push(top.left);
				}
			} else {
				System.out.println(q.pop().data);
			}
		}
	}

	public boolean isMirror(TreeNode n1, TreeNode n2) {

		if (n1 == null && n2 == null) {
			return true;
		}
		if (n1 != null && n2 != null && n1.data == n2.data) {
			return isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
		}
		return false;
	}

	public boolean isSame(TreeNode n1, TreeNode n2) {

		if (n1 == null && n2 == null) {
			return true;
		}
		if (n1 != null && n2 != null && n1.data == n2.data) {
			return isMirror(n1.left, n2.left) && isMirror(n1.right, n2.right);
		}
		return false;
	}

}
