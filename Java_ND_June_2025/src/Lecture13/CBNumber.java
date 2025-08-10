package Lecture13;

public class CBNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "4991";
		boolean arr[] = new boolean[s.length()];
		
		int count=0;
		for (int i = 1; i <=s.length(); i++) {
			for (int j = 0; j <= s.length()-i; j++) {
				String t = s.substring(j,j+i);
				
				long n = Long.parseLong(t);
//				System.out.println(n);
				if(isCbNumber(n) && isvisited(j,j+i,arr)) {
					System.out.println(n);
					count++;
					
					for (int k = j; k < j+i; k++) {
						arr[k] = true;
					}
				}
			}
		}
		System.out.println(count);
	}

	private static boolean isvisited(int j, int i, boolean[] arr) {
		// TODO Auto-generated method stub
		
		for (int k = j; k <i; k++) {
			if(arr[k] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean isCbNumber(long n) {
		// TODO Auto-generated method stub
		if(n == 0 || n==1) {//point 1 
			return false;
		}
		long arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		
		for (int i = 0; i < arr.length; i++) {//point 2
			if(arr[i] == n) {
				return true;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {//point 3
			if(n% arr[i] == 0) {
				return false;
			}
		}
		
		return true;
	}

}
