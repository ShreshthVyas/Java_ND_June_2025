package Lecture25;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,20);
		add(10,20,30);
		add(10,20,30,40,50,60,70);
	}
	private static int add(int i, int...args) {
		// TODO Auto-generated method stub
//		int arr[]  =args;
		int sum  =0;
		for (int j = 0; j < args.length; j++) {
			sum+= args[i];
		}
		 return sum;
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		 return i+j;
	}
	private static int add(int i, int j,int k) {
		// TODO Auto-generated method stub
		 return i+j;
	}
	private static int add(int i, int j,double k) {
		// TODO Auto-generated method stub
		 return i+j;
	}
	
	

}
