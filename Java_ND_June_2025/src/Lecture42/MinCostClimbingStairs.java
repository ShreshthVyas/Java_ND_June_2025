package Lecture42;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,100,1,1,1,100,1,1,100,1};
		
		int stepzero = rec(arr,0);
		int stepOne = rec(arr,1);
		System.out.println(Math.min(stepzero, stepOne));
	}

	private static int rec(int[] arr, int i) {
		// TODO Auto-generated method stub
		if(i>= arr.length) {
			return 0;
		}
		int one =  rec(arr, i+1);
		int two =  rec(arr, i+2);
		return arr[i] + Math.min(one, two);
	}

}
