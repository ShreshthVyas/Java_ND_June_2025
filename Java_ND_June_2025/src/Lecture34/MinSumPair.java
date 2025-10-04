package Lecture34;

import java.util.PriorityQueue;

public class MinSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,3,2};
		PriorityQueue<Integer> pq  = new PriorityQueue<>();
		
		for (int i : arr) {
			pq.add(i);
		}
		int sum = 0;
		while(pq.size()>1) {
			int a =  pq.poll();
			int b = pq.poll();
			
			pq.add(a+b);
			sum+= a+b;
		}
		
		System.out.println(sum);
	}

}
