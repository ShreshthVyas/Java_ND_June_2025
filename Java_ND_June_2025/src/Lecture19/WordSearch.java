package Lecture19;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean exist(char[][] board, String word) {
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j] == word.charAt(0)) {
					boolean ans = rec(board,word,i,j,0);
					if(ans) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean rec(char[][] board, String word, int cr, int cc, int idx) {
		// TODO Auto-generated method stub
		if(idx == word.length()) {
			return true;
		}
		if(cr<0 || cc<0 || cr>= board.length || cc>=board[0].length|| board[cr][cc] !=word.charAt(idx)) {
			return false;
		}
		
		board[cr][cc] = '*';
		int r[] = {-1,1,0,0};
		int c[] = {0,0,-1,1};
		
		for (int i = 0; i < c.length; i++) {
			boolean ans = rec(board, word, cr+r[i], cc+c[i], idx+1);
			if(ans) {
				return true;
			}
		}
		board[cr][cc] = word.charAt(idx);
		return false;
		
	}

}
