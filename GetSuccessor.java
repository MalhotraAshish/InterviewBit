package javaTrees;

public class GetSuccessor {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public TreeNode getSuccessor(TreeNode a, int b) {
		
		if(a == null) {
			return null;
		}
		TreeNode temp = null;
		while(a != null) {
			if(a.val > b) {
				temp = a;
				a = a.left;
			}else {
				a = a.right;
			}
		}
		
		return temp;
	}
}
