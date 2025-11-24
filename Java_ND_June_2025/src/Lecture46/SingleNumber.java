package Lecture46;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int singleNumber(int[] nums) {
		int mask = 0;
		
		for (int i : nums) {
			mask =  mask^i;
		}
		return mask;
	}
}
