package Lecture17;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "aba";
		rec(ques,"");
	}

	public static void rec(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String left = ques.substring(0,i);
			String right = ques.substring(i+1);
			rec(left+right, ans+ch);	
		}
		
	}

}
