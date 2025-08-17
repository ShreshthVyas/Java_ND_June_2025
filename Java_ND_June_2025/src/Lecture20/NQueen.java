package Lecture20;



public class NQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		
		boolean board[][] = new boolean[n][n];
		
		rec(0,n,board,0);
	}

	public static void rec(int qpsf, int tq, boolean[][] board,int row) {
		// TODO Auto-generated method stub
		if(qpsf == tq) {
			Display(board);
			return;
		}
		if(row == board.length) {
			return;
		}
		
		for (int col = 0; col < board.length; col++) {
			if(isPossible(row,col,board)) {
				board[row][col] = true;
				rec(qpsf+1, tq, board, row+1);
				board[row][col] = false;//backtracking
			}
		}
		
		
	}

	public static boolean isPossible(int row, int col, boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = row; i>=0; i--) {//UP
			if(board[i][col]) {
				return false;
			}
		}
		int r = row;
		int c = col;
		
		while(r>=0 && c>=0) {// LEFT  - upper diagonal
			if(board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		
		r= row;
		c =col;
		
		while(r>=0 && c<board.length) {// Right  - upper diagonal
			if(board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		
		
		return true;
	}

	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j] == true) {
					System.out.print("Q");
				}
				else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
