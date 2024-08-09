package Day02;

public class Ex02_Char {
	public static void main(String[] args) {
		// 문자 자료형 char 
		// 리터럴(Literal)
		// : 소스코드에서 표기하는 데이터(숫자인지 문자인지 문자열인지 의미를 부여하는것)
		// - 문자 리터럴 : 'A' (작은 따옴표)
		// - 문자열 리터럴 : "Apple" (큰 따옴표)
		// - 정수 리터럴 : 100
		// - 실수 리터럴 : 12.34fF, 12.345D
		
		char c1 = 'A';			// 문자 리터럴
		char c2 = 65;			// 십진수 --> 아스키코드표 매핑된 문자
		char c3 = '\u0041';		// 유니코드
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int unicode = c1;
		
		// alt + click  = 다중 커서만들기
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
		System.out.println("c5 : " + c5);
		System.out.println("c6 : " + c6);
		
		System.out.println("A의 코드값 : " + unicode);
		
		
		//[자료형 변환]
		//자바에서 정수는 기본적으로 (int)형으로 취급한다.
		//연산은 기본적으로 같은 자료형끼리만 가능하다.
		//작은 자료형과 큰 자료형을 연산하면, 그 결과는 큰 자료형이 된다.
		//(c2 + 1) 				: (char)+(int) = (int) 자동 형 변환
		// chB = (char)(c2 + 1) : (char) = (char)(int) 강제 형 변환
		char chB = (char)(c2 + 1);
		System.out.println("chB의 코드값 : " + (int)chB);
		System.out.println("chB의 문자값 : " + chB);
		
		for(int i=0;i<10;i++) {
			
			System.out.println((char)(c2 + i));
		}
	}
}
