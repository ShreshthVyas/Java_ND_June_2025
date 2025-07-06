package Lecture9;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int stalls[] = new int[nos];
		
		for (int i = 0; i < stalls.length; i++) {
			stalls[i] = sc.nextInt();
		}
		
		System.out.println(binarysearch(stalls,noc,nos) );
	}

	public static int binarysearch(int[] stall, int noc, int nos) {
		// TODO Auto-generated method stub
		Arrays.sort(stall);
		int lo = 1;
		int hi = stall[stall.length-1] - stall[0];
		int ans = -1;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isItPossible(stall,mid,noc,nos)) {
				ans = mid;
				lo = mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		return ans;
	}

	public static boolean isItPossible(int[] stall, int mid, int noc, int nos) {
		// TODO Auto-generated method stub
		int prev = stall[0];
		int cpsf =1;
		
		for (int i = 1; i < stall.length; i++) {
			if(stall[i] - prev >= mid) {
				prev = stall[i];
				cpsf++;
			}
			if(cpsf == noc) {
				return true;
			}
		}
		return false;
	}

}
