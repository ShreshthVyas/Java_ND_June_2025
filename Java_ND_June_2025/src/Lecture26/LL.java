package Lecture26;

public class LL {

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

	public void removefirst() {
		if (size == 0) {

		} else {
//			Node temp = head.next;
//			head = temp;
			head = head.next;
			this.size--;
		}

	}

	public void removelast() {
		if (size == 0) {

		} else {
			Node temp = this.head;
			
			while(temp.next!=tail) {
				temp =  temp.next;
			}
			this.tail = temp;
			this.tail.next = null;
		}
		this.size--;
	}
	
	public void Display() {
		Node temp = this.head;
		while(temp!=null) {
			System.out.print(temp.val+" ==> ");
			temp = temp.next;
		}
		System.out.println(".");
	}
	
	public int getAtIdx(int idx) {
		if(idx>=size) {
			return -1;
		}
		int count= 0;
		Node temp = head;
		while(count!=idx) {
			temp = temp.next;
			count++;
		}
		return temp.val;
	}
	
	public void addAtIdx(int idx,int t) {
		int count= 1;
		Node temp = head;
		while(count!=idx) {
			temp = temp.next;
			count++;
		}
//		Node nn = new Node(t,temp.next);
		Node nn = new Node();
		nn.val = t;
		nn.next = temp.next;
		temp.next = nn;
		this.size++;
	}
	
	public void removeAtIdx(int idx) {
		int count= 1;
		Node temp = head;
		while(count!=idx) {
			temp = temp.next;
			count++;
		}
		temp.next = temp.next.next;
		this.size--;
	}
	
	public int Mid() {
		int count= 1;
		Node temp = head;
		while(temp!=null) {
			temp = temp.next;
			count++;
		}
		int i =0;
		int mid = count/2;
		temp  = head;
		while(i<mid) {
			temp = temp.next;
			i++;
		}
		return temp.val;
	}
	
	public boolean linearsearch(int k) {
		Node temp = head;
		while(temp!=null) {
			if(temp.val == k) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}

}
