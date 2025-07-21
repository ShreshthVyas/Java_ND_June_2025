package Lecture13;

import java.util.Scanner;

public class CBNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		String s = sc.next();
		
		for (int i = 1; i <=s.length(); i++) {
			for (int j = 0; j <= s.length()-i; j++) {
				System.out.println(s.substring(j,j+i));
			}
		}
	}

}
