package doitEx;

public class P90_Q6 {
	public static void main(String[] args) {
		int num = 8;
		
		System.out.println(num += 10);
		System.out.println(num -= 10);
		System.out.println(num >>= 2);
		
		//칸수 이동 >> 2의n승 자리만큼 이동
		
		num = 8; // 이진수 0000 1000
		// 2의1승 2진수 0000 0010 두번째칸 두칸이동 >> 오른쪽으로 
		System.out.println(num >> 2); // 결과값 2  0000 0010
		// 2의1승 2진수 0000 0010 두번째칸 두칸이동 << 왼쪽으로
		System.out.println(num << 2); // 결과값 32 0010 0000
	}
}
