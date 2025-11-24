package Lecture44;

import java.util.Arrays;

public class Min_falling_Path_Sum_2 {

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
		int ans = Integer.MAX_VALUE;
		for (int col = 0; col < dp[0].length; col++) {
			if(col!=cc) {
				ans  = Math.min(ans, rec(matrix, cr+1, col, dp));
			}
			
		}
		return dp[cr][cc]= ans  + matrix[cr][cc];
	}

}
