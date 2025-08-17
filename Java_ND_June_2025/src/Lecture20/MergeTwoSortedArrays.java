package Lecture20;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,9};
		int brr[] = {2,3,8,10};
		
		int ans[] = mergeTwoSortedArrays(arr,brr);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] mergeTwoSortedArrays(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int ans [] = new int[arr.length+brr.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<arr.length && j< brr.length) {
			if(arr[i]<brr[j]) {
				ans[k] = arr[i];
				i++;
			}
			else {
				ans[k] = brr[j];
				j++;
			}
			k++;
		}
		
		while(i<arr.length) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		while(j<brr.length) {
			ans[k] = brr[j];
			j++;
			k++;
		}
		return ans;
	}

}
