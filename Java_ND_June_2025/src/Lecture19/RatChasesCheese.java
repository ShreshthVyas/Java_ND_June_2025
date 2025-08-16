package Lecture19;

import java.util.Arrays;
import java.util.Scanner;

public class RatChasesCheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int m = sc.nextInt();
		
		char arr[][] = new char[n][m];
		
		for (int i = 0; i < arr.length; i++) {
			String s = sc.next();
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		int ans[][] = new int[n][m];
		int count = rec(ans,arr,0,0,n,m);
		if(count== 0) {
			System.out.println("NO PATH FOUND");
		}
		
	}

	public static int rec(int[][] ans, char[][] arr, int cr, int cc, int n, int m) {
		// TODO Auto-generated method stub
		if(cr == n-1 && cc ==m-1) {//+ve base case
			ans[cr][cc] = 1;
			Display(ans);
			ans[cr][cc] = 0;
			return 1;
		}
		if(cr<0 || cc<0 || cr>= n || cc>=m|| arr[cr][cc] == 'X') {
			return 0;
		}
		int count = 0;
		ans[cr][cc] = 1;
		arr[cr][cc] = 'X';
		count+=rec(ans, arr, cr-1, cc, n, m);//UP
		count+=rec(ans, arr, cr+1, cc, n, m);//D
		count+=rec(ans, arr, cr, cc-1, n, m);//L
		count+=rec(ans, arr, cr, cc+1, n, m);//R	
		ans[cr][cc] = 0;
		arr[cr][cc] = 'O';
		
		return count;
	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int[] is : ans) {
			System.out.println(Arrays.toString(is));
		}
	}

}
