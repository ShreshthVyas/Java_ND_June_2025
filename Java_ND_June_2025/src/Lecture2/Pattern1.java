package Lecture2;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		int nst= n; // no of stars
		
		while(row<=n) {// rows
			int cst =0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}
	}

}
