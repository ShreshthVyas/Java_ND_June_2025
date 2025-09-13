package Lecture27;

import java.util.Stack;

import Lecture27.LinkedListMidLeetcode.ListNode;

public class ReverseLLLeetcodeStack {
	
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
	 public ListNode reverseList(ListNode head) {
	       Stack<ListNode> st = new Stack<>();
	       while(head!=null) {
	    	   st.add(head);
	    	   head = head.next;
	       }
	       ListNode temp = st.pop();
	       ListNode newhead = temp;
	       
	       while(!st.isEmpty()) {
	    	   temp.next = st.pop();
	    	   temp = temp.next;
	       }
	       
	       return newhead;   
	 }
}
