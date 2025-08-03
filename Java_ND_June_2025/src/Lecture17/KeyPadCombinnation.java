package Lecture17;

public class KeyPadCombinnation {
	// abc , 2 -> def , 3 -> ghi , 4 -> jkl , 5 -> mno , 6 -> pqrs , 7 -> tuv , 8 -> wx , 9 -> yz
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kp[] = {"*", "abc" ,"def" ,"ghi" , "jkl" , "mno" , "pqrs" ,"tuv" , "wx" , "yz"};
		rec(kp,"12" , "");
	}

	public static void rec(String[] kp, String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		String s = kp[ch-'0'];
		
		for (int i = 0; i < s.length(); i++) {
			rec(kp, ques.substring(1), ans+s.charAt(i));
		}
		
	}

}
