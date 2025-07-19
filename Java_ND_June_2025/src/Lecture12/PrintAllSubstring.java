package Lecture12;

public class PrintAllSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=  "abcd";
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <=s.length(); j++) {
//				String t = "";
//				for (int k = i; k < j; k++) {
//					t+= s.charAt(k);
//				}
//				System.out.println(t);
				System.out.println(s.substring(i,j));
			}
		}
	}

}
