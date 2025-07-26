package Lecture14;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		Integer  a = 10;
		Integer b = 10;
		System.out.println(a==b);
//		System.out.println(n == a);
		
		long l = 1000000000000l;
		Long ll = 10l;
		
		boolean c = true;
		Boolean bb = true;
		
		short s = 10;
		Short ss = 10;
		
		byte g = 2;
		Byte gg = 10;
		
		double d = 2.2;
		Double dd = 2.3;
		
		float f = 2.2f;
		Float ff = 2.2f;
		
		Integer y = 10;
		int j = y;//un-boxing
		
		System.out.println(y);
		
		int u = 10;
		Integer h = u;//auto-boxing
		
		System.out.println(h);
		
		
		
	}

}
