package Lecture5;

public class FunctionReturnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a  = 10;
		int b  =  20;
		int c  = sum(a,b);
		System.out.println(c);
	}
	
	public static int  sum(int a , int b) {
		int sum  = a+b;
		return sum;
	}
}
