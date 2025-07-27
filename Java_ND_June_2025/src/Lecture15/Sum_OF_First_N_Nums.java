package Lecture15;

public class Sum_OF_First_N_Nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		int ans  = sum(n);
		System.out.println(ans);
	}

	public static int sum(int n) {
		// TODO Auto-generated method stub
		if(n==1) {
			return 1;
		}
		
		int sum_of_nMinusOne = sum(n-1);
		return sum_of_nMinusOne + n;
		
	}

}
