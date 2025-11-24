package Lecture45;

import java.util.HashMap;

public class Trie {

	public class Node {
		Character ch;
		boolean isEnd = false;
		HashMap<Character, Node> child = new HashMap<>();
	}

	private Node root;

	public Trie() {
		Node nn = new Node();
		nn.ch = '*';
		this.root = nn;
	}

	public void insert(String word) {
		Node curr = root;

		for (char ch : word.toCharArray()) {
			if (curr.child.containsKey(ch)) {// character already present
				curr = curr.child.get(ch);
			} else {
				Node nn = new Node();
				nn.ch = ch;
				curr.child.put(ch, nn);
				curr = nn;
			}
		}
		curr.isEnd = true;
	}

	public boolean search(String word) {
		Node curr = root;

		for (char ch : word.toCharArray()) {
			if (curr.child.containsKey(ch)) {// character already present
				curr = curr.child.get(ch);
			} else {
				return false;
			}
		}
		
		return curr.isEnd;
	}

	public boolean startsWith(String prefix) {
		Node curr = root;

		for (char ch : prefix.toCharArray()) {
			if (curr.child.containsKey(ch)) {// character already present
				curr = curr.child.get(ch);
			} else {
				return false;
			}
		}
		
		return true;
	}

}
