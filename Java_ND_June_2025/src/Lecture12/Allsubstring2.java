package Lecture12;

public class Allsubstring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		
		for (int i = 1; i <=s.length(); i++) {
			for (int j = 0; j <= s.length()-i; j++) {
				System.out.println(s.substring(j,j+i));
			}
		}
	}

}
