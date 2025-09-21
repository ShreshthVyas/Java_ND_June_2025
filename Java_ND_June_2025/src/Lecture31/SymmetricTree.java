package Lecture31;

import Lecture31.PathSumleetcode.TreeNode;

public class SymmetricTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public boolean isSymmetric(TreeNode root) {
		return symm(root.left,root.right);
	}

	public boolean symm(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root1==null && root2==null) {//both child null
			return true;
		}
		if(root1==null || root2==null) {// one child null , one not null
			return false;
		}
		if(root1.val!=root2.val) {
			return false;
		}
		
		boolean left = symm(root1.left, root2.right);
		boolean right = symm(root1.right, root2.left);
		
		return left&& right;
	}
}
