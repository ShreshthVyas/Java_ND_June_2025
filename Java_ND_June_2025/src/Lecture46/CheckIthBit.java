package Lecture46;

public class CheckIthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 176;
		int i = 5;
		int mask =  1<<i;
		if((a&mask) !=0) {
			System.out.println("SetBit");
		}
		else{
			System.out.println("Not a SetBit");
		}
	}

}
