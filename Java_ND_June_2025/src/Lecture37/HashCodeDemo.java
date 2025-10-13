package Lecture37;

public class HashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n  =1000;
		System.out.println(n.hashCode());
		
		String s = "hello";
		System.out.println(s.hashCode());
		
		int arr[] = {1,2,3,4,5};
		System.out.println(arr.hashCode());
		
		Long l =  1000000000000000000l;
		System.out.println(l.hashCode());
	}

}
