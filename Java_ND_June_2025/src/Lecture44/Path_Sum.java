package Lecture44;

import java.util.Arrays;
import java.util.Iterator;

public class Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{}};
		int dp[][] =  new int[arr.length][arr[0].length];
		for (int[] is : dp) {
			Arrays.fill(is, -1);
		}
		int ans =  rec(arr, 0,0,dp);
	}

	private static int rec(int[][] arr, int cr, int cc,int dp[][]) {
		// TODO Auto-generated method stub
		if(cr == arr.length-1 && cc == arr[0].length-1) {
			return arr[cr][cc];
		}
		if(cr>= arr.length || cc>= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if(dp[cr][cc]!=-1) {
			return dp[cr][cc];
		}
		int down = rec(arr, cr+1, cc,dp);
		int right = rec(arr, cr, cc+1,dp);
		return dp[cr][cc] = Math.min(down, right) + arr[cr][cc];
	}
	
	

}
