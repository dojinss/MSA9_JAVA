package Day02;

public class Ex14_BitOperator {
	public static void main(String[] args) {
		//AND
		int result = 20 & 16;
//		System.out.println(result);
		
		
		// Integer.toBinaryString() : 십진수를 이진수 문자열로 변화하는 메소드
		System.out.println( Integer.toBinaryString(20));
		System.out.println( Integer.toBinaryString(16));
		System.out.println( Integer.toBinaryString(result));
		System.out.println("--------------");
		
		// OR
		int result2 = 20 | 16;
//		System.out.println(result2);
		
		System.out.println( Integer.toBinaryString(20));
		System.out.println( Integer.toBinaryString(16));
		System.out.println( Integer.toBinaryString(result2));
		System.out.println("--------------");
		
		// XOR
		// : 서로 값이 다르면 true 반환, 같으면 false반환
		int result3 = 20 ^ 16;
//		System.out.println(result2);
		
		System.out.println( Integer.toBinaryString(20));
		System.out.println( Integer.toBinaryString(16));
		System.out.println( Integer.toBinaryString(result3));
	}
}
