package Lecture25;

import Lecture23.Stack;

public class DynamicStack extends Stack {
	
	@Override
	public void push(int item) throws Exception {
		// TODO Auto-generated method stub
		if(isFull()) {
			int newarr[] = new int[2*arr.length];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			this.arr = newarr;
		}
		super.push(item); 
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack st = new DynamicStack();
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		
		st.Display();
		
	}

}
