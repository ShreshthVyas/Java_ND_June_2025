package Lecture15;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =3;
		int b =4;
		
		int ans = pow(a,b);
		System.out.println(ans);
	}

	public static int pow(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0) {
			return 1;
		}
		
		int temp = pow(a,b-1);
		return temp * a;
	}

}
