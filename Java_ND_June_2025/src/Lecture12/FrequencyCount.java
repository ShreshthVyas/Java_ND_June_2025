package Lecture12;

import java.util.Arrays;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abaabbccgggghhhzzzzaaaabbbcccd";
		
		int arr[] = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			arr[ch-'a']++;
		}
		
//		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			char ch =(char) (i+'a');
			if(arr[i]>0) {
				System.out.println(ch + " -> " + arr[i]);
			}
			
		}
		
		
//		for (int i = 0; i < s.length(); i++) {
//			int count = 0;
//			for (int j = i+1; j < s.length(); j++) {
//				if(s.charAt(j) == s.charAt(i)) {
//					count++;
//				}
//			}
//			System.out.println(s.charAt(i)+" "+count);
//		}
	}

}
