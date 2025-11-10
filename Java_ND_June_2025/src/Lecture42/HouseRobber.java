package Lecture42;

import java.util.Arrays;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 7, 9, 3, 1 };
		int dp[] = new int[arr.length];
//		for (int i = 0; i < dp.length; i++) {
//			dp[i] = -1;
//		}
		Arrays.fill(dp, -1);
		int ans = rec(arr, arr.length - 1, dp);
		System.out.println(ans);
	}

	private static int rec(int[] arr, int i, int dp[]) {
		// TODO Auto-generated method stub
		if (i < 0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + rec(arr, i - 2, dp);
		int dnr = rec(arr, i - 1, dp);
		return dp[i] = Math.max(rob, dnr);
	}

	public int rob(int[] arr) {
		if(arr.length == 1) {
			return arr[0];
		}
		int dp[] = new int[arr.length];
		dp[0] =  arr[0];
		dp[1] =  Math.max(arr[0], arr[1]);
		
		for (int i = 2; i < dp.length; i++) {
			int rob = arr[i] + dp[i-2];
			int dnr = dp[i-1];
			dp[i] = Math.max(rob, dnr);
		}
		return dp[dp.length-1];
	}
//	private static int rec(int[] arr, int i) {
//		// TODO Auto-generated method stub
//		if(i<0) {
//			return 0;
//		}
//		int inc = arr[i] + rec(arr, i-2);
//		int exc =  rec(arr, i-1);
//		return Math.max(inc, exc);
//	}

}
