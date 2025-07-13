package Lecture11;

import java.util.Scanner;

public class ArrayInput_OutputDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m  =sc.nextInt();
		
		int arr[][] = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {//row
				arr[i][j] = sc.nextInt();
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {//row
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
