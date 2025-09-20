package Lecture30;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

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

	Scanner sc = new Scanner(System.in);
	private Node root;

	public BinaryTree() {
		this.root = createTree();
	}

	private Node createTree() {
		// TODO Auto-generated method stub
		Node nn = new Node();
		nn.val = sc.nextInt();

		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = createTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = createTree();
		}
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

	public boolean Find(int k) {
		return find(this.root, k);
	}

	private boolean find(Node node, int k) {
		// TODO Auto-generated method stub
		if (node == null) {
			return false;
		}
		if (node.val == k) {
			return true;
		}
		boolean left = find(node.left, k);
		boolean right = find(node.right, k);

		return left || right;
	}

	public int Max() {
		return max(this.root);
	}

	private int max(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int leftmax = max(node.left);
		int rightmax = max(node.right);

		return Math.max(node.val, Math.max(leftmax, rightmax));
	}

	public int Min() {
		return min(this.root);
	}

	private int min(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int leftmax = min(node.left);
		int rightmax = min(node.right);

		return Math.min(node.val, Math.min(leftmax, rightmax));
	}

	public int Height() {
		return height(this.root);
	}

	private int height(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);

		return Math.max(lh, rh) + 1;
	}

	public void PreOrder() {
		preOrder(root);
		System.out.println();
	}

	private void preOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");// N
		preOrder(node.left);// L
		preOrder(node.right);// R
	}

	public void InOrder() {
		inorder(this.root);
		System.out.println();
	}

	private void inorder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		inorder(node.left);// L
		System.out.print(node.val + " ");// N
		inorder(node.right);// R
	}

	public void PostOrder() {
		postOrder(this.root);
		System.out.println();
	}

	private void postOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		postOrder(node.left);// L
		postOrder(node.right);// R
		System.out.print(node.val + " ");// N
	}

	public void LevelOrder() {
		Queue<Node> q = new LinkedList<>();

		q.add(root);// enqueue
//		q.offer(root);
		while (!q.isEmpty()) {
			Node nn = q.remove();// dequeue // q.poll();
			System.out.print(nn.val + " ");

			if (nn.left != null) {
				q.offer(nn.left);
			}
			if (nn.right != null) {
				q.offer(nn.right);
			}
		}
		System.out.println();
	}

	public void LevelOrderLevelwise() {
		Queue<Node> q = new LinkedList<>();
		Queue<Node> h = new LinkedList<>();

		q.add(root);// enqueue

		while (!q.isEmpty()) {
			Node nn = q.remove();// dequeue 
			System.out.print(nn.val + " ");

			if (nn.left != null) {
				h.offer(nn.left);
			}
			if (nn.right != null) {
				h.offer(nn.right);
			}
			if(q.isEmpty()) {
				q = h;
				h = new LinkedList<>();
				System.out.println();
			}
		}
	}
}
