package Lecture12;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "namans";
		System.out.println(palindrome(s));
	}

	public static boolean palindrome(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = s.length()-1;
		
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
