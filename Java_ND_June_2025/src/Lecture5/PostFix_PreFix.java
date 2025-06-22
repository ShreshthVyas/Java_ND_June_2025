package Lecture5;

public class PostFix_PreFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10;
////		System.out.println(a++);
//		System.out.println(++a);
//		System.out.println(a);
		
		int a =10;
		int b =20;
		
		int sum  = a++ + --b + 23 + b-- + a-- + 3 + --a;
		System.out.println(sum);
		System.out.println(a);
		System.out.println(b);
		
	}

}
