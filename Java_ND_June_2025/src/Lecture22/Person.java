package Lecture22;

public class Person {
	static int count =0;
	int id = 10;
	String name;
	
	private int age = 100;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		count++;
	}
	
	public  void greet(String name) {
		System.out.println( this.name + " says hello  to " + name);
	}
	
//	static {
//		System.out.println("helllo2 from static");
//		int a =10;
//		System.out.println("hello from static");	
//	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age)  {
		try {
			if(age<0) {
				throw new Exception("Age cannot be negetive");
			}
			else {
				this.age = age;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("hello from finally");
		}
		System.out.println("Hello");	
	}
}
