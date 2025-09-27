package Lecture32;

import Lecture30.BinaryTree.Node;

public class BST {

	public class Node {
		int val;
		Node left;
		Node right;

		public Node() {

		}

		public Node(int val) {
			this.val = val;
		}
	}
	private Node root;
	
	public BST(int[] arr) {
		this.root = cretateTree(arr,0,arr.length-1);
	}
	
	private Node cretateTree(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		if(lo>hi) {
			return null;
		}
		
		int mid = (hi+lo)/2;
		Node nn = new Node();
		nn.val = arr[mid];
		
		nn.left = cretateTree(arr, lo, mid-1);
		nn.right = cretateTree(arr, mid+1, hi);
		
		return nn;
	}

	public void Display() {
		display(this.root);
	}

	private void display(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		String s = node.val + "";
		if (node.left != null) {
			s = node.left.val + " <== " + s;
		} else {
			s = ". <== " + s;
		}
		if (node.right != null) {
			s = s + " ==> " + node.right.val;
		} else {
			s = s + " ==> .";
		}
		System.out.println(s);
		display(node.left);
		display(node.right);
	}
	
	public static void main(String[] args) {
		int in[] = {25,50,65,90,95,100,180,200,210};
		BST bst =  new BST(in);
		
		bst.Display();
	}

}
