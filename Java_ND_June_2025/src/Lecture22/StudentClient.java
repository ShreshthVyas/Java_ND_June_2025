package Lecture22;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		Student s3 = new Student();
		s.name = "name";
		System.out.println(s.id);
		System.out.println(s.name);
		s.greet();
		
		Student s1 = new Student(10);
		
		Student s2 = new Student(10,"name");
		
	}

}
