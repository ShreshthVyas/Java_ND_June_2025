package Lecture14;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb =  new StringBuilder();
		
		sb.append('a');
		sb.append('a');
		sb.append('a');
		sb.append('a');
		sb.append('a');
		sb.append('a');
		
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.replace(0, 0, null);
		sb.delete(0, 2);
		
		sb.length();
		for (int i = 0; i < sb.length(); i++) {
			sb.charAt(i);
		}
		
		
		
		
	}

}
