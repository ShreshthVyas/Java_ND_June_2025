package Lecture8;

public class AllSubarrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		
		for (int i = 0; i < arr.length; i++) {//starting point
			for (int j = i; j < arr.length; j++) {//ending point
				
				for (int k = i; k <=j; k++) {
					System.out.print(arr[k]);
				}
				
			}
		}
		
	}

}
