package Lecture6;

public class Swap {
	public static void main(String[] args) {
		int a  = 10;
		int b = 20;
		System.out.println(a + " " + b);
		swap(a,b);
		System.out.println(a + " " + b);
	}

	public static void swap(int a, int b) {
		// TODO Auto-generated method stub
		int t = a;
		a=b;
		b =t;
		System.out.println(a + " , " + b);
	}
}
