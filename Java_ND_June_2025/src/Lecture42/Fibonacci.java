package Lecture42;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 40;
		int dp[] = new int[n + 1];
//		
//		int ans = fibTD(n,dp);
		int ans2 = fibBU(n, dp);
		System.out.println(ans2);
	}

	private static int fibBU(int n, int[] dp) {//Tabulation
		// TODO Auto-generated method stub
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}

//	private static int fib(int n) {
//		// TODO Auto-generated method stub
//		if(n == 1 || n==0) {
//			return n;
//		}
//		return fib(n-1) + fib(n-2);
//	}
	private static int fibTD(int n, int dp[]) {// Memoization
		// TODO Auto-generated method stub
		if (n == 1 || n == 0) {
			return n;
		}
		if (dp[n] != 0) {// already calculated
			return dp[n];
		}
		return dp[n] = fibTD(n - 1, dp) + fibTD(n - 2, dp);
	}

}
