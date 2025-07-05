package Lecture8;

public class KadanesAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxSubArray(int[] nums) {
		int sum =0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			sum+= nums[i];
			max = Math.max(max, sum);
			if(sum<0) {// new starting point
				sum=0;
			}
		}
		
		return max;
	}

}
