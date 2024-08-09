package Day02;

public class Ex05_Long {
	public static void main(String[] args) {
		//int (4byte : 32bits) : 2^32 : 약 42억
		
		
		//long (8byte : 64bits) :2^64
		
		long ln1 = 1000;
		long ln2 = 2100000000;
		long ln3 = 2200000000l;
		// long 타입 리터럴
		// 숫자뒤에 L을 붙이지 않으면 int로 인식
		
		
		System.out.println("ln1 : " +ln1);
		System.out.println("ln2 : " +ln2);
		System.out.println("ln3 : " +ln3);
	}
}
