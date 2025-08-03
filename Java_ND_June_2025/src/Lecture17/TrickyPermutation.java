package Lecture17;

public class TrickyPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abbs";
		rec(ques,"");
	}
	public static void rec(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		boolean arr[] = new boolean[26];
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if(arr[ch-'a'] == false) {
				arr[ch-'a'] = true;
				String left = ques.substring(0,i);
				String right = ques.substring(i+1);
				rec(left+right, ans+ch);
			}
				
		}
	}
}
