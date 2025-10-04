package Lecture34;

public class HeapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap h = new Heap();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(110);
		h.add(-10);
		h.add(330);
		h.add(80);
		h.Display();
		h.remove();
		System.out.println(h.get());
		h.Display();
		
	}

}
