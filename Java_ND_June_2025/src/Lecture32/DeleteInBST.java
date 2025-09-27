package Lecture32;

import Lecture32.InsertIntoBST.TreeNode;

public class DeleteInBST {
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

	public TreeNode deleteNode(TreeNode root, int key) {
		if(root == null) {
			return null;
		}
		if(root.val<key) {
			root.right = deleteNode(root.right,key);
		}
		else if (root.val>key) {
			root.left = deleteNode(root.left,key);
		}
		else {
			if(root.left==null) {//both child null or left null
				return root.right;
			}
			else if(root.right == null) {//only right null
				return root.left;
			}
			else {
				int leftmax = max(root.left);//left subtree max
				root.left = deleteNode(root.left, leftmax);//delete leftmax
				root.val = leftmax;
			}
		}
		return root;
	}

	private int max(TreeNode node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return Integer.MIN_VALUE;
		}
		int right = max(node.right);
		
		return Math.max(right, node.val);
	}

}
