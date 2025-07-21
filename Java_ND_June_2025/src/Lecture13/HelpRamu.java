package Lecture13;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		
		while(t-->0) {
			int c1= sc.nextInt();
			int c2= sc.nextInt();
			int c3= sc.nextInt();
			int c4= sc.nextInt();
			
			int nor = sc.nextInt();
			int noc = sc.nextInt();
			int r[] = new int[nor];
			int c[] = new int[noc];
			
			for (int i = 0; i < r.length; i++) {
				r[i] = sc.nextInt();
			}
			
			for (int i = 0; i < c.length; i++) {
				c[i] = sc.nextInt();
			}
			int rick_min = calculate_min(nor,r,c1,c2,c3,c4);
			
			int cab_min = calculate_min(noc, c, c1, c2, c3, c4);
			
			int ans = Math.min(cab_min+rick_min, c4);
			System.out.println(ans);
		}
	}

	public static int calculate_min(int nor, int[] r, int c1, int c2, int c3, int c4) {
		// TODO Auto-generated method stub
		int ans =0;
		
		for (int i = 0; i < r.length; i++) {
			ans+= Math.min(r[i]*c1,c2);
		}
		
		return Math.min(ans, c3);
	}

}
