package Lecture46;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 176;
		countsetbit(a);
		countsetbitfaster(a);	
	}
	private static void countsetbitfaster(int a) {//O(SetBit)
		// TODO Auto-generated method stub
		int count =0;
		while(a>0) {
			a = a & (a-1);
			count++;
		}
		System.out.println(count);
	}

	private static void countsetbit(int a) {//O(32)
		// TODO Auto-generated method stub
		int count =0;
		while(a>0) {
			if((a&1) == 1) {// Rightmost bit is set
				count++;
			}
			a = a>>1;
		}
		System.out.println(count);
	}

}
