package Day07.Review;

import java.util.Scanner;

public class Ex06_Method {
	// 메소드 정의
	// : 접근지정자 (static) 반환타입 메소드명( 매개변수 ) {}
	
	/**
	 * 덧셈 메소드
	 * -작성자-
	 * @param a : 첫번째 피연산자
	 * @param b : 두번째 피연산자
	 * @return : 덧셈한 결과값
	 */
	public static int plus(int a, int b) {
		int result = a+b;
		return result;
	}
	
	/**
	 * 뺄셈 메소드
	 * -작성자-
	 * 최댓값 500, 음수 불가능
	 * @param a
	 * @param b
	 * @return 뺄셈한 결과값
	 */
	public static int minus(int a, int b) {
		// return 이후에 코드는 이미 메소드가 종료되었기 때문에 실행되지 않는다.
		if( a < 0 || b < 0) return 0;		// 음수 필터링
		if( a > 500 || b > 500) return 0;	// 최댓값 500
		
		
		int result = a - b;
		
		// return(값);
		// 1. 값을 메소드를 호출한 자리로 반환
		// 2. 메소드 종료
		// 3. 메모리 해제
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		System.out.println( plus(a,b) );
		System.out.println( minus(a,b) );
		
		sc.close();
	}
}
