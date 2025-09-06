package Lecture25;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		P obj =  new P();
//		System.out.println(obj.a);
//		System.out.println(obj.b);
//		obj.f();
//		obj.f1();
		
//		C obj =  new C();
//		System.out.println(obj.b);
//		System.out.println(obj.c);
////		System.out.println(obj.a);
//		System.out.println(((P)(obj)).a);
//		
//		obj.f();
//		((P)(obj)).f();
//		obj.f1();
//		obj.f2();
		
//		P obj = new C();
//		System.out.println(obj.a);
//		System.out.println(obj.b);
//		System.out.println(((C)(obj)).c);
//		
//		obj.f();
//		obj.f1();
//		((C)(obj)).f2();
		
		C obj = (C) new P();
	}

}
