package Lecture13;

import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		next(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void next(int[] arr) {
		// TODO Auto-generated method stub
		if(arr.length==1) {
			return;
		}
		int p = 0;
		for (int i = arr.length-2; i>=0; i--) {
			if(arr[i]<arr[i+1]) {
				p = i;
				break;
			}
		}
		int q = 0;
		for (int i = arr.length-1; i>=0; i--) {
			if(arr[i]>arr[p]) {
				q = i;
				break;
			}
		}
		
		if(p ==0 && q==0) {// Largest permutation
			reverse(arr, 0);
			return;
		}
		swap(arr,p,q);
		if(p<arr.length-1) {
			reverse(arr,p+1);
		}
		
		
	}

	public static void reverse(int[] arr, int i) {
		// TODO Auto-generated method stub
		int j = arr.length-1;
		
		while(i<j) {
			swap(arr,i,j);
			i++;
			j--;
		}
		
	}

	public static void swap(int[] arr, int p, int q) {
		// TODO Auto-generated method stub
		
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		
	}

}
