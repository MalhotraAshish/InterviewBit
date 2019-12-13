package javaTrees;

public class IdenticalBinaryTree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	public int isSameTree(TreeNode A, TreeNode B) {
        if(A == null && B == null){
            return 1;
        }else if(A != null && B != null){
            if(A.val == B.val && (isSameTree(A.left, B.left) == 1) && (isSameTree(A.right, B.right) == 1)){
                return 1;
            }
        }
        else{
            return 0;
        }
        return 0;
    }
}
