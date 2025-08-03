package Lecture17;

import java.util.Scanner;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
//		if (m > n) {
//			board(0, n, n, "");
//		} else {
//			board(0, n, m, "");
//		}
		int ans  = board(0, n, m, "");
		System.out.println(ans);
	}

	public static int board(int i, int n, int m, String ans) {
		// TODO Auto-generated method stub
		if (i > n) {
			return 0;
		}
		if (i == n) {
			System.out.println(ans);
			return 1;
		}
		int count =0;
		for (int j = 1; j <=m; j++) {
			count+=board(i+j, n, m, ans+j);
		}
		return count;

	}

//	public static void board(int i, int n, String ans) {
//		// TODO Auto-generated method stub
//		if(i>n) {
//			return;
//		}
//		if(i == n) {
//			System.out.println(ans);
//			return;
//		}
//		board(i+1, n, ans+1);
//		board(i+2, n, ans+2);
//		board(i+3, n, ans+3);
//	}

}
