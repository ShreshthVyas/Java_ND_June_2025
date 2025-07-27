package Lecture15;

public class PrintDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		
		print(n);
		
	}

	public static void print(int n) {
		// TODO Auto-generated method stub
		if(n ==0) {//base case
			return;
		}
		
		System.out.println(n);
		print(n-1);
		
	}

}
