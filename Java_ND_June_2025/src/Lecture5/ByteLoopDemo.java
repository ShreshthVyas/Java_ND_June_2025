package Lecture5;

public class ByteLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for (byte i = 0; i < 128; i++) {
//			System.out.println(i);
//		}
//		for (byte i = 0; i <=127; i++) {
//			System.out.println(i);
//		}
		for (byte i = -128; i <=127; i++) {
			
			System.out.println(i);
			if(i == 127) {
				break;
			}
		}
	}

}
