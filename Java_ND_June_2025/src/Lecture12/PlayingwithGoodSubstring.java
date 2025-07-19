package Lecture12;

public class PlayingwithGoodSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaeicdeaiaiaiaiaiaiai";
		int count =0;
		int max =0;
		for (int i = 0; i < s.length(); i++) {
			if(isVowel(s.charAt(i))) {
				count++;
			}
			else {
				max = Math.max(max, count);
				count = 0;
			}
		}
		max = Math.max(max, count);
		System.out.println(max);
	}

	public static boolean isVowel(char ch) {
		// TODO Auto-generated method stub
		if(ch =='a'|| ch == 'e' ||ch == 'i' ||ch == 'o'||ch == 'u') {
			return true;
		}
		return false;
	}

}
