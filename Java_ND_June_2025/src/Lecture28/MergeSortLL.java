package Lecture28;

import Lecture27.DetectCycleLeetcode.ListNode;

public class MergeSortLL {

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

	public ListNode sortList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode mid = middleNode(head);
		ListNode sh = mid.next;
		mid.next =null;
		ListNode a = sortList(head);
		ListNode b = sortList(sh);
		
		return mergeTwoLists(a, b);
	}
	public ListNode mergeTwoLists(ListNode a, ListNode b) {
		ListNode head =  new ListNode(0);
		ListNode temp = head;
		while(a!=null && b!=null) {
			if(a.val<b.val) {
				temp.next = a;
				a = a.next;
			}
			else {
				temp.next = b;
				b = b.next;
			}
			temp = temp.next;
		}
		
		if(a==null) {
			temp.next = b;
		}
		if(b == null) {
			temp.next = a;
		}
		return head.next;
		
	}
	public ListNode middleNode(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
