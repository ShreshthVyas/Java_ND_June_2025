package Lecture46;

public class SingleNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[] singleNumber(int[] nums) {
	        int ans = 0;
			
			for (int i : nums) {
				ans =  ans^i;
			}
			
			int mask =  ans & (~(ans-1));
			int temp = 0;
			
			for (int i : nums) {
				if((i&mask)!=0) {
					temp= temp^i;
				}
			}
			ans =  ans^temp;
			
			return new int[] {ans,temp};
	    }

}
