package Lecture25;

import Lecture23.Queue;

public class DynamicQueue extends Queue{
	
	@Override
	public void enqueue(int item) throws Exception {
		// TODO Auto-generated method stub
		if(isFull()) {
			int newarr[] = new int[2*arr.length];
			int k = 0;
			for (int i = 0; i < size; i++) {
				int idx  = (front+i)%arr.length;
				newarr[k++] = arr[idx];
			}
			this.arr = newarr;
			this.front = 0;
		}
		super.enqueue(item);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		dq.enqueue(60);
		dq.enqueue(70);
		
		dq.Display();
	}

}
