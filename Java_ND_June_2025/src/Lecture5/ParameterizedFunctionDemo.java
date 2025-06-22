package Lecture5;

public class ParameterizedFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 30;
		sum(a,b);
		System.out.println(a);
	}
	public static void sum(int a , int b) {
		int sum  = a+b;
		System.out.println(sum);
	}

}
