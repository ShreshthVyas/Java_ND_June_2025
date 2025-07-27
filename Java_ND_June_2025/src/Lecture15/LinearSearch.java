package Lecture15;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,-1,11,17,19,6};
		int ans = ls(arr,20,0);
		System.out.println(ans);
	}

	public static int ls(int[] arr, int target,int idx) {
		// TODO Auto-generated method stub
		if(idx==arr.length) {
			return -1;
		}
		if(arr[idx] == target) {
			return idx;
		}
		int temp = ls(arr, target, idx+1);
		return temp;
	}

}
