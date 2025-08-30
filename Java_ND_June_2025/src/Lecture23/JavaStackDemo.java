package Lecture23;
import java.util.Stack;
public class JavaStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st =  new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.pop();
		st.peek();
		st.isEmpty();
		System.out.println(st);
	}

}
