package Lecture16;

public class BalancedParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		balanced(n,0,0,"");
	}

	public static void balanced(int n, int op, int cl, String ans) {
		// TODO Auto-generated method stub
		if(op>n) {
			return;
		}
		if(op == n && cl==n) {
			System.out.println(ans);
			return;
		}
		
		balanced(n, op+1, cl, ans+"(");
		if(op>cl) {
			balanced(n, op, cl+1, ans+")");
		}
		
	}

}
