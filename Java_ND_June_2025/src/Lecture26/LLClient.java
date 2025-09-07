package Lecture26;

public class LLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL l = new LL();
		l.addfirst(10);
		l.addfirst(20);
		l.addLast(30);
		l.addLast(40);
		l.addLast(50);
		l.addLast(60);
		
		l.Display();
		l.removefirst();
		l.removelast();
		l.Display();
		
		System.out.println(l.getAtIdx(2));
		
		l.addAtIdx(3, 100);
		l.Display();
		l.removeAtIdx(3);
		l.Display();
		
		System.out.println(l.Mid());
		
		System.out.println(l.linearsearch(40));
		
	}

}
