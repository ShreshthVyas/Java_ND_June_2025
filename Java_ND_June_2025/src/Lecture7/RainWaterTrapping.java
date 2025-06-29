package Lecture7;

public class RainWaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int trap(int[] height) {
		int leftmax[] = new int[height.length];
		int rightmax[] = new int[height.length];
		
		leftmax[0] = height[0];
		
		for (int i = 1; i < rightmax.length; i++) {
			leftmax[i] = Math.max(leftmax[i-1], height[i]);
		}
		
		rightmax[rightmax.length-1] = height[height.length-1];
		
		for (int i = height.length-2; i>=0; i--) {
			rightmax[i] = Math.max(rightmax[i+1], height[i]);
		}
		int sum =0;
		for (int i = 0; i < height.length; i++) {
			int unit  = Math.min(leftmax[i], rightmax[i]) - height[i];
			sum+= unit;
		}
		
		return sum;
	}

}
