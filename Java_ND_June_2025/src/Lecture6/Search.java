package Lecture6;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1, 8,-2, 6,7,9,10,-4};
		boolean ans = LinearSearch(arr,-4);
		System.out.println(ans);
	}

	public static boolean LinearSearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return true;
			}
		}
		return false;
	}

}
