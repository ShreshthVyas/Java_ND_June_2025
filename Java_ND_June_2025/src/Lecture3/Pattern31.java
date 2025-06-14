package Lecture3;

import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		
		int nst =n;
		int row = 1;
		
		while(row<= n) {
			int val =n;
			int cst =0;
			while(cst<nst) {
				if(cst == n-row) {
					System.out.print("* ");
				}
				else {
					System.out.print(val + " ");
				}
				cst++;
				val--;
			}
			row++;
			System.out.println();
		}
		
	}

}
