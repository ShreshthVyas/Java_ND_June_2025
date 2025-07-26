package Lecture14;

public class StringIssueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
//		long start = System.nanoTime();
//		int n = 10000;
//		for (int i = 0; i < n; i++) {
//			s+=i;
//		}
//		long end = System.nanoTime();
//		System.out.println(end - start);
		
		StringBuilder sb= new StringBuilder();
		long start = System.nanoTime();
		int n = 10000;
		for (int i = 0; i < n; i++) {
			sb.append(i);
		}
		long end = System.nanoTime();
		System.out.println(end - start);
	}

}
