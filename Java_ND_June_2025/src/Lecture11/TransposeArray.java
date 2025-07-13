package Lecture11;

import java.util.Arrays;

public class TransposeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] ={ {1,2,3,4} , {5,6,7,8}, 
				{9,10,11,12}, {13,14,15,16}};
		
		Transpose(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		} 
		for(int a[] : arr) {
			System.out.println(Arrays.toString(a));
		}
	}

	public static void Transpose(int[][] arr) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
	}

}
