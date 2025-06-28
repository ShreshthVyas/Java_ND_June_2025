package Lecture6;

public class Swap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		
		System.out.println(arr[1] + " , " + arr[3]);
		
		swap(arr,1,3);
		System.out.println(arr[1] + " , " + arr[3]);
		
	}
	public static void swap(int brr[] , int i, int j) {
		// TODO Auto-generated method stub
		int t = brr[i];
		brr[i]=brr[j];
		brr[j] =t;
	}

}
