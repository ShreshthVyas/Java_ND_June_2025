package Lecture34;

import java.util.ArrayList;

public class Heap {
	
	private ArrayList<Integer> h;
	
	public Heap() {
		h =  new ArrayList<>();
	}
	//O(LogN)
	public void add(int t) {
		h.add(t);// adds at last
		upheapify(h.size()-1);
	}
	//O(LogN)
	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci-1)/2;
		if(h.get(pi)>h.get(ci)) {//violates min heap
			swap(pi,ci);
			upheapify(pi);
		}
		
	}
	
	public int remove() {
		swap(0, h.size()-1);//swap first and last
		int rv=  h.remove(h.size()-1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {//O(LogN)
		// TODO Auto-generated method stub
		int c1 = 2*pi +1;
		int c2 = 2*pi +2;
		int mini = pi;
		
		if(c1<h.size() && h.get(mini)>h.get(c1)) {
			mini = c1;
		}
		if(c2<h.size() && h.get(mini)>h.get(c2)) {
			mini = c2;
		}
		
		if(pi!=mini) {
			swap(pi,mini);
			downheapify(mini);
		}
		
		
	}
	private void swap(int pi, int ci) {
		// TODO Auto-generated method stub
		int tc = h.get(ci);
		int tp = h.get(pi);
		
		h.set(pi, tc);
		h.set(ci, tp);
	}
	
	public int get() {
		return h.get(0);
	}
	
	public void Display() {
		System.out.println(h);
	}
}
