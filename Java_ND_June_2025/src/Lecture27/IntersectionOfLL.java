package Lecture27;

import Lecture27.LLReverseIterrative.ListNode;

public class IntersectionOfLL {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int la = length(headA);
		int lb = length(headB);
		int diff = Math.abs(la-lb);
		if(la>lb) {
			while(diff>0) {
				headA = headA.next;
				diff--;
			}
		}
		else {
			while(diff>0) {
				headB = headB.next;
				diff--;
			}
		}
		while(headA!=null) {
			if(headA==headB) {//intersection found
				return headA;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return null;
	}

	private int length(ListNode head) {
		// TODO Auto-generated method stub
		ListNode temp = head;
		int count=0;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

}
