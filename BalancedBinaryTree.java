package javaTrees;

public class BalancedBinaryTree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	public int isBalanced(TreeNode A) {

		if (A == null) {
			return 1;
		}

		int lh = 0, rh = 0;
		lh = Height(A.left);
		rh = Height(A.right);

		if ((Math.abs(lh - rh) <= 1) && (isBalanced(A.left) == 1) && (isBalanced(A.right) == 1)) {
			return 1;
		}

		return 0;
	}
	public int Height(TreeNode B){
        if(B == null){
            return 0;
        }
        return 1 + Math.max(Height(B.left), Height(B.right));
    }
}
