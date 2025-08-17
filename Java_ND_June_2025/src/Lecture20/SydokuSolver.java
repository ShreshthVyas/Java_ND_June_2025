package Lecture20;

import java.util.Scanner;

public class SydokuSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[9][9];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		rec(arr,0,0);
	}

	public static void rec(int[][] arr, int row, int col) {
		// TODO Auto-generated method stub
		if(col == 9) {//row filled
			col =0;
			row++;
		}
		if(row == 9) {//Sudoku solved
			Display(arr);
			return;
		}
		if(arr[row][col]!=0) {
			rec(arr, row, col+1);
		}
		else {
			for (int val = 1; val < 10; val++) {
				if(isPossible(arr,row,col,val)) {
					arr[row][col] = val;
					rec(arr, row, col+1);
					arr[row][col] = 0;
				}
			}
		}
		
		
	}
	public static boolean isPossible(int[][] arr, int row, int col,int val) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {//col
			if(arr[row][i] == val) {
				return false;
			}
		}
		for (int i = 0; i < arr.length; i++) {//row
			if(arr[i][col] == val) {
				return false;
			}
		}
		
		int r = row - row%3;
		int c = col - col%3;
		
		// 3*3 square
		for (int i = r; i < r+3; i++) {
			for (int j = c; j < c+3; j++) {
				if(arr[i][j] == val) {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void Display(int[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
