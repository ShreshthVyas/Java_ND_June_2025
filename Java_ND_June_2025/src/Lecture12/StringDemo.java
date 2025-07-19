package Lecture12;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		String s1 = "hello";
		String s2 = new String("hello");
		System.out.println(s2);
		System.out.println(s ==  s1);
		System.out.println(s ==  s2);
		
//		String s3 = new String("hello");
		String s3 = s2;
		
		System.out.println(s2 == s3);
		
	}

}
