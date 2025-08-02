package Lecture16;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		toss(n,"");
		
	}

	public static void toss(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(ans);
			return;
		}
		toss(n-1,ans+"H");
		toss(n-1,ans+"T");	
	}

}
