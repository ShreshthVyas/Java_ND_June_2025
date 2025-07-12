package Lecture10;

public class TimeComplexity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	
//		for (int i = 0; i < n; i++) {
//			System.out.println("Hello");
//		}
		int i = 0;
		int n = 10;
		
		while(i<n) {
			//
			i++;
		}//O(N)
		
		while(i<n) {
			//
			i+=2;
		}//O(N)
		
		while(i<n) {
			//
			i+=2;
		}//O(N)
		
		
		while(i<n) {
			//
			i+=2;
			i+=3;
		}//O(N)
		
		int k = 5;
		while(i<n) {
			//
			i+=k;
		}//O(N/k)
		
		while(i<n) {
			//
			n--;
		}//O(N)
		
		while(i<n) {
			//
			n = n/2;
		}//O(LogN) 
		
		while(i<n) {
			//
			n = n/2;
			n = n/3;
		}//O(LogN) 
		
		while(i<n) {
			//
			n = n/k;
		}//O(LogN base k)
		
		while(i<n) {
			//
			i= i*2;
		}// O(LogN)
		
		while(i<n) {
			//
			i= i*5;
		}// O(LogN)
		while(i<n) {
			//
			i= i*k;
		}// O(LogN base k)
		
		for (int j = 1; j*j <=n ; j++) {
			
		}//O(sqrt N)
		
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < n; b++) {
				
			}
		}//O(N^2)
		
		for (int a = 0; a < n; a++) {
			for (int b = a; b < n; b++) {
				
			}
		}// O(N^2)
		
		for (int a = 0; a < n; a++) {
			for (int b = 0; b <=a; b++) {
				
			}
		}//O(N^2)
		
		for (int j = 1; j < n; j*=2) {
			
		}//O(LogN)
		
		for (int a = 0; a <=n ; a++) {
			for (int b= 1; b <= a*a; b++) {
				for (int c = 0; c <=n/2; c++) {
					
				}
			}
		}//O(N^4)
		
		for (int a = n/2; a <=n ; a++) {
			for (int b= 1; b <= n/2; b++) {
				for (int c = 1; c <=n/2; c*=2) {
					
				}
			}
		}//O(N^2 LogN)
		
	}
	
	//Binary Search - O(Log N)
	//Linear Search  - O(N)
	//Bubble Sort - O(N^2)
	//Insertion Sort - O(N^2)
	//Selection Sort - O(N^2)
	
}
