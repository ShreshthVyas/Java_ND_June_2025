package Lecture18;

public class CoinCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,5};
		coin(arr,5,"",0);
	}

	public static void coin(int[] arr, int target, String ans,int idx) {
		// TODO Auto-generated method stub
		if(target == 0) {
			System.out.println(ans);
			return;
		}

		
		for (int i = idx; i < arr.length; i++) {
			if(target - arr[i]>=0) {
				coin(arr, target-arr[i], ans+arr[i],i);
			}
		}	
	}

}
