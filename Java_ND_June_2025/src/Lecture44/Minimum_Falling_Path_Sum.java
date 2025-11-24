package Lecture44;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum {
	//leetcode.com/problems/minimum-falling-path-sum/
	public int minFallingPathSum(int[][] matrix) {
		int ans =  Integer.MAX_VALUE;
		int dp[][] =  new int[matrix.length][matrix[0].length];
		for (int[] is : dp) {
			Arrays.fill(is, -100001);
		}
		for (int i = 0; i < matrix[0].length; i++) {
			ans =  Math.min(ans, rec(matrix,0,i,dp));
		}
		return ans;
	}

	private int rec(int[][] matrix, int cr, int cc,int dp[][]) {
		// TODO Auto-generated method stub
		if(cc<0 || cc>= matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if(cr == matrix.length-1) {
			return matrix[cr][cc];
		}
		if(dp[cr][cc]!= -100001) {
			return dp[cr][cc];
		}
		int d = rec(matrix, cr+1, cc,dp);
		int ld = rec(matrix, cr+1, cc-1,dp);
		int rd =  rec(matrix, cr+1, cc+1,dp);
		return dp[cr][cc]=  Math.min(d, Math.min(ld, rd)) + matrix[cr][cc];
	}
}
