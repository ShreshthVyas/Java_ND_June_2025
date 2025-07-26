package Lecture14;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		long start = System.nanoTime();
		String ans = reverse(s);
		long end = System.nanoTime();
		System.out.println(end - start);
		System.out.println(ans);
	}

	public static String reverse(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(s);
//		
//		for (int i = s.length()-1; i>=0; i--) {
//			sb.append(s.charAt(i));
//		}
		return sb.reverse().toString();
	}

}
