package Lecture23;

import java.util.Stack;

public class InsertAtBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st =  new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		iab(60,st);
		System.out.println(st);
	}

	private static void iab(int i, Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			st.push(i);
			return;
		}
		
		int a = st.pop();
		iab(i, st);
		st.push(a);
		
	}

//	public static void iab(int i,Stack<Integer> st) {
//		// TODO Auto-generated method stub
//		Stack<Integer> temp = new Stack<>();
//		
//		while(!st.isEmpty()) {
//			int a =  st.pop();
//			temp.push(a);
//		}
//		st.push(i);
//		while(!temp.isEmpty()) {
//			int a =  temp.pop();
//			st.push(a);
//		}
//	}

}
