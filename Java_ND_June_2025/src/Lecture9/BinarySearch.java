package Lecture9;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,2,6,7,13,21};
		
		System.out.println(binarysearch(arr,3));
	}

	public static boolean binarysearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		int lo =0;
		int hi = arr.length-1;
		
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(arr[mid] == target) {
				return true;
			}
			if(arr[mid]>target) {
				hi = mid-1;
			}
			else {//arr[mid]<target
				lo = mid+1;
			}
		}
		
		return false;
	
	}

}
