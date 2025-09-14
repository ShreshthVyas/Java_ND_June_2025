package Lecture28;

public class LLCycle {

	public class Node {
		int val;
		Node next;

		public Node() {

		}

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size = 0;

	public void addfirst(int temp) {
		if (size == 0) {
			Node nn = new Node();
			nn.val = temp;
			this.head = nn;
			this.tail = nn;
		} else {
			Node nn = new Node();
			nn.val = temp;
			nn.next = head;
			this.head = nn;
		}
		this.size++;
	}

	public void addLast(int temp) {
		if (size == 0) {
			Node nn = new Node();
			nn.val = temp;
			this.head = nn;
			this.tail = nn;
		} else {
			Node nn = new Node();
			nn.val = temp;
			tail.next = nn;
			this.tail = nn;
		}
		this.size++;
	}

	public Node getAtIdx(int idx) {
		if (idx >= size) {
			return null;
		}
		int count = 0;
		Node temp = head;
		while (count != idx) {
			temp = temp.next;
			count++;
		}
		return temp;
	}

	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.val + " ==> ");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public void createCycle(int idx) {
		Node n = getAtIdx(idx);
		this.tail.next = n;
	}

	public Node MeetPoint() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

	// O(N^2)
	public void removeCycle() {
		Node mp = MeetPoint();
		if (mp == null) {// No cycle
			return;
		}
		Node c = head;

		while (c != null) {// to check c is starting point or not
			Node temp = mp;
			while (temp.next != mp) {// cycle travel
				if (temp.next == c) { // starting point of cycle found
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			c = c.next;
		}
	}

	// O(nc + c) ==> O(N)
	public void CycleRemovalOptimised() {
		Node mp = MeetPoint();
		if (mp == null) {// No cycle
			return;
		}
		// Step - 1 , count cycle length
		Node temp = mp;
		int count = 1;

		while (temp.next != mp) {// traverse in cycle
			count++;
			temp = temp.next;
		}
		Node f = head;
		Node s = head;
		// Step Move F count times
		for (int i = 0; i < count; i++) {
			f = f.next;
		}

		// Move s and f together
		while (s.next != f.next) {
			s = s.next;
			f = f.next;
		}
		f.next = null;// cycle remove

	}
	//O(N)
	public void FloydCycleRemoval() {
		Node mp = MeetPoint();
		if (mp == null) {// No cycle
			return;
		}
		Node f = mp;
		Node s = head;

		// Move s and f together
		while (s.next != f.next) {
			s = s.next;
			f = f.next;
		}
		f.next = null;
	}
}
