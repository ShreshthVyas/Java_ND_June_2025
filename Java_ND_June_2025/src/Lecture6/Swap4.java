package Lecture6;

public class Swap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		int brr[] = {9,8,7,10,11};
		System.out.println(arr[1]+ " " + brr[1]);
		swap(arr,brr);
		System.out.println(arr[1]+ " " + brr[1]);
	}

	public static void swap(int[] c, int[] d) {
		// TODO Auto-generated method stub
		int t[] = c;
		c =d;
		d =t;
	}

}
