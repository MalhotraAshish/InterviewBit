package javaTrees;

public class SymmetricBinaryTree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int isSymmetric(TreeNode A) {
		if (A == null)
			return 1;
		return isSymmetric(A.left, A.right);
	}

	public int isSymmetric(TreeNode l, TreeNode r) {
		if (l == null && r == null) {
			return 1;
		} else if (r == null || l == null) {
			return 0;
		}

		if (l.val != r.val)
			return 0;

		if (isSymmetric(l.left, r.right) == 0)
			return 0;
		if (isSymmetric(l.right, r.left) == 0)
			return 0;

		return 1;
	}
}
