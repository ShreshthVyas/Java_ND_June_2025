package Lecture38;

import java.util.Scanner;
import java.util.Stack;

public class zigzag {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		zigzag m = new zigzag();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void levelOrderZZ() {
			Stack<Node>  st = new Stack<>();
			Stack<Node>  h = new Stack<>();
			boolean ltr = true;
			st.push(root);
			while(!st.isEmpty()) {
				Node rv =  st.pop();
				System.out.print(rv.data+" ");
				if(ltr) {
					if(rv.left!=null) {
						h.push(rv.left);
					}
					if(rv.right!=null) {
						h.push(rv.right);
					}
				}
				else {
					if(rv.right!=null) {
						h.push(rv.right);
					}
					if(rv.left!=null) {
						h.push(rv.left);
					}
				}
				if(st.isEmpty()) {
					ltr =  !ltr;
					st= h;
					h =  new Stack<>();
				}
			}
		}

	}
}
