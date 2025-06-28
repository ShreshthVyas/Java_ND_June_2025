package Lecture6;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		
		System.out.println(arr[1] + " , " + arr[3]);
		swap(arr[1],arr[3]);
		System.out.println(arr[1] + " , " + arr[3]);
		
	}
	public static void swap(int a, int b) {
		// TODO Auto-generated method stub
		int t = a;
		a=b;
		b =t;
	}

}
