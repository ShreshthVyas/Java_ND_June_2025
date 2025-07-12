package Lecture10;

import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nob = sc.nextInt();
		int nos = sc.nextInt();
		int arr[] = new int[nob];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ans = binarysearch(arr,nob,nos);
		System.out.println(ans);
	}

	public static int binarysearch(int[] arr, int nob, int nos) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = 0;
		for (int i = 0; i < arr.length; i++) {
			hi+= arr[i];
		}
		int ans = 0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			
			if(isitPossible(mid,arr,nob,nos)) {
				ans = mid;
				hi= mid-1;
			}
			else {
				lo = mid+1;
			}
		}
		
		return ans;
		
	}

	public static boolean isitPossible(int mid, int[] arr, int nob, int nos) {
		// TODO Auto-generated method stub
		int s =1;
		int pages_read = 0;
		
		for (int i = 0; i < arr.length; ) {
			if(pages_read + arr[i] <=mid) {
				pages_read+= arr[i];
				i++;
			}
			else {
				s++;
				pages_read = 0;
			}
			if(s>nos) {
				return false;
			}
		}
		return true;
	}

}
