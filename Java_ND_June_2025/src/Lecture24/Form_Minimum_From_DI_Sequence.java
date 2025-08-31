package Lecture24;

import java.util.Arrays;
import java.util.Stack;

public class Form_Minimum_From_DI_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IIDIDDDI";
		int ans[]= new int[s.length()+1];
		Stack<Integer> st =  new Stack<>();
		int count = 1;
		for (int i = 0; i <=s.length(); i++) {
			if(i == s.length() || s.charAt(i) == 'I') {
				ans[i] = count++;
				
				while(!st.isEmpty()) {
					ans[st.pop()] = count++;
				}	
			}
			else {
				st.push(i);
			}
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
