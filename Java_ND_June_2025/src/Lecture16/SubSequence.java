package Lecture16;

public class SubSequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		int ans = subseq(s,"");
		System.out.println(ans);
	}

	public static int subseq(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length() ==0) {
			System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		int inc = subseq(ques.substring(1), ans);//exclusion
		int exc = subseq(ques.substring(1), ans+ch);// inclusion
		return inc+exc;
	}

}
