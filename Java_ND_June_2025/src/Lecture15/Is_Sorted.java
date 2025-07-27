package Lecture15;

public class Is_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,5,-1,6,7,9,10};
		boolean ans = check(arr,1);
		System.out.println(ans);
	}

	public static boolean check(int[] arr, int i) {
		// TODO Auto-generated method stub
		if(i == arr.length) {
			return true;
		}
		if(arr[i]<arr[i-1]) {
			return false;
		}
		return check(arr, i+1);
	}

}
