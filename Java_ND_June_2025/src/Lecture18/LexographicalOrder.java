package Lecture18;

public class LexographicalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		rec(0,1000);
	}

	public static void rec(int ans, int n) {
		// TODO Auto-generated method stub
		if(ans>n) {
			return;
		}
		System.out.println(ans);
		int i =0;
		if(ans == 0) {
			i =1;
		}
		for (; i <=9; i++) {
			rec(ans*10 +i, n);
		}
		
	}

}
