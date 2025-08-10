package Lecture12;

import java.util.Scanner;

public class Allsubstring2 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String s = sc.next();
		
		for (int i = 1; i <=s.length(); i++) {
			for (int j = 0; j <= s.length()-i; j++) {
				System.out.println(s.substring(j,j+i));
			}
		}
	}
}
