package Lecture11;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(".......");
		for (int i : arr) {
			System.out.println(i);
		}
		
		String brr[] = {"abc" , "def" , "huf" , "wjefef"};
		
		for (String g : brr) {
			System.out.println(g);
		}
	}

}
