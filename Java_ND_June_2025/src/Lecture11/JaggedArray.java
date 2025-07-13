package Lecture11;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][];
		
		for (int i = 0; i < arr.length; i++) {
			int m = sc.nextInt();
			int[] temp = new int[m];
			arr[i] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {//row
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {//row
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {//row
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
