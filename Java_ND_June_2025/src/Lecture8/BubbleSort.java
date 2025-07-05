package Lecture8;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,2,1};
		
		sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		System.out.println(Arrays.toString(arr));
		
	}

	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		for (int pass = 1; pass < arr.length; pass++) {
			for (int j = 0; j < arr.length-pass; j++) {
				if(arr[j]>arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		
		
	}

}
