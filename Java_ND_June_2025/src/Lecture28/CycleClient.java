package Lecture28;

public class CycleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLCycle ll = new LLCycle();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);
		ll.createCycle(2);
//		ll.removeCycle();
//		ll.CycleRemovalOptimised();
		ll.FloydCycleRemoval();
		ll.Display();
				
	}

}
