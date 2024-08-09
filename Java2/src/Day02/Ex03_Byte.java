package Day02;

public class Ex03_Byte {
	
	public static void main(String[] args) {
		//Byte 는 1byte 범위에서 정수 데이터를 표현
		//8bits (2진수 8자리)
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 8;
		byte var4 = 38;
		byte var5 = (byte)128; 
		
		// <에러>
		// 에러메세지 : Type mismatch
		// 자료형(타입) 불일치, 데이터 범위를 벗어남(overflow)
		// 범위를 넘어서면 다시 첫번째(byte의 경우 -128부터 다시 계산됨)(overflow)
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
	}
}
