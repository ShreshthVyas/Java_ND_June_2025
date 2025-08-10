package Lecture18;

public class CoinPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,5};
		coin(arr,5,"");
	}

	public static void coin(int[] arr, int target, String ans) {
		// TODO Auto-generated method stub
		if(target == 0) {
			System.out.println(ans);
			return;
		}
//		if(target<0) {
//			return;
//		}
		
		for (int i = 0; i < arr.length; i++) {
			if(target - arr[i]>=0) {
				coin(arr, target-arr[i], ans+arr[i]);
			}
		}	
	}
}
