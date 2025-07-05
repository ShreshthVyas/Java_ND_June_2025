package Lecture8;

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4 };

		
	}

	public static int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {// starting point
			int sum = 0;
			for (int j = i; j < nums.length; j++) {// ending point
				sum += nums[j];
				max = Math.max(max, sum);
			}
		}
		
		return max;
	}

}
