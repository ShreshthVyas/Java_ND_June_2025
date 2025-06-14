package Lecture3;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int nsp = n-1;
		int nst = 1;
		int row =1;
		int val = n;
		while(row<=n) {
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
			int cst = 0;
			while(cst<nst) {
				if(cst<nst/2) {
					System.out.print(val + " ");
					val++;
				}
				else if (cst == nst/2) {
					System.out.print("0 ");
					val--;
				}
				else {
					System.out.print(val + " ");
					val--;
				}
				
				cst++;
			}
			
			nst+=2;
			nsp--;
			row++;
			System.out.println();
		}
	}

}
