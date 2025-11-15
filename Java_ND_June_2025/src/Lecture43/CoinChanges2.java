package Lecture43;

public class CoinChanges2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[] = { 1, 2, 5 };
		int amount = 5;
		Integer dp[][] = new Integer[coins.length][amount + 1];
		rec(coins, 5, 0, dp);
	}

	private static int rec(int[] coin, int amount, int i, Integer dp[][]) {
		// TODO Auto-generated method stub
		if (amount == 0) {
			return 1;
		}
		if (i == coin.length) {
			return 0;
		}
		if (dp[i][amount] != null) {
			return dp[i][amount];
		}
		int inc = 0;
		int exc = 0;
		if (amount >= coin[i]) {
			inc = rec(coin, amount - coin[i], i, dp);
		}
		exc = rec(coin, amount, i + 1, dp);
		return dp[i][amount] = inc + exc;
	}

	public int change(int amount, int[] coins) {
		int dp[][] = new int[coins.length+1][amount + 1];
		
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int amnt = 1; amnt < dp[0].length; amnt++) {
				int inc = 0;
				int exc = 0;
				if (amnt >= coins[i-1]) {
					inc =  dp[i][amnt- coins[i-1]];
				}
				exc =  dp[i-1][amnt];
				dp[i][amnt] = inc + exc;
			}
		}
		return dp[dp.length-1][dp[0].length-1];
	}
}
