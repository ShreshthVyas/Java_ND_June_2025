package Lecture7;

public class RoatateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1 ,2,3,4,5,6,7};
		rotate(arr, 4);
	}

//	public static void rotate(int[] nums, int k) {
//		int n  = nums.length;
//		k = k%n;
//		for (int j = 0; j < k; j++) {
//			int ele = nums[n-1];
//			for (int i = n-2; i>=0; i--) {
//				nums[i+1] = nums[i];
//			}
//			nums[0] = ele;
//		}
//		
////		for (int i = 0; i < nums.length; i++) {
////			System.out.print(nums[i]+ " ");
////		}
//	}
	
	public static void rotate(int[] nums, int k) {
		int n  = nums.length;
	    k = k%n;  
	    
	    reverse(nums, 0, n-1);// full array reverse
	    reverse(nums, 0, k-1);// k elements from starting
	    reverse(nums, k, n-1);
	}
	
	public static void reverse(int[] arr,int i , int j) {
		// TODO Auto-generated method stub
		while(i<j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
		
	}

}
