package Lecture15;

public class PrintIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		print(n);
	}

	public static void print(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return;
		}
		
		print(n-1);
		System.out.println(n);
	}

}
