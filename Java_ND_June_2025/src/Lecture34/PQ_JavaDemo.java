package Lecture34;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ_JavaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> h  = new PriorityQueue<>(Collections.reverseOrder());
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(110);
		h.add(-10);
		h.add(330);
		h.add(80);
		
		System.out.println(h.poll());
	}

}
