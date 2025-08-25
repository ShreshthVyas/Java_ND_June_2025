package Lecture22;

public class Student {

	int id;
	String name;
	
	public Student() {
		
	}
	public Student(int i) {
		id = i;
		
	}
	public Student(int i,String n) {
		id = i;
		name = n;
	}
	

	public void greet() {
		System.out.println("Hello");
	}
}
