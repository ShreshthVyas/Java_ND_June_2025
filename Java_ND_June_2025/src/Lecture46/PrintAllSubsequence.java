 package Lecture46;

public class PrintAllSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		int n = s.length();
		for (int i = 0; i < (1<<n); i++) {
			subseq(s,i);
		}
	}

	private static void subseq(String s, int a) {
		// TODO Auto-generated method stub
		int pos = 0;
		while(a>0) {
			if((a&1) == 1) {//bit is set
				System.out.print(s.charAt(pos));
			}
			pos++;
			a>>=1;// a= a>>1
		}
		System.out.println();
	}

}
