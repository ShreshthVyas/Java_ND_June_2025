package Lecture15;

public class NFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int ans = fact(n);
		
		System.out.println(ans);
	}

	public static int fact(int n) {
		// TODO Auto-generated method stub
		if(n == 1) {
			return 1;
		}
		
		
		int f = fact(n-1);
		return f * n;
		
	}

}
