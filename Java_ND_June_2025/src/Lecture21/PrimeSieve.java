package Lecture21;

public class PrimeSieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		primesieve(n);
	}

	public static void primesieve(int n) {
		// TODO Auto-generated method stub
		boolean arr[] = new boolean[n+1];
		
		for (int i = 2; i*i <=n ; i++) {
			if(arr[i] == false) {
				for (int j = 2; i*j < arr.length ; j++) {
					arr[i*j] = true;
				}
			}
		}
		
		for (int i = 2; i < arr.length; i++) {
			if(arr[i] == false) {
				System.out.println(i);
			}
		}
		
		
	}

}
