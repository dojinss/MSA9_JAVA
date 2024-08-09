package Day02;

public class Ex01_Variable {
	
	public static void main(String[] args) {
		// 변수 선언
		// - 자료형 변수명
		
		//[변수 선언 시작->]
		
		// 일반적인 변수선언
		int x;			
		int y;
		
		// 동시선언 , 기준으로 동시선언가능
		int a,b;		

		// 변수 초기화
		x = 100;
		y = 200;
		a = 10;
		b = 20;
		
		// 선언 및 초기화
		int i = 10;
		int j = 20;
		

		//[<-변수 선언 끝]
		
		// x,y	: 피연산자
		// +	: 연산자
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		// 합계
		System.out.println("x + y : " + (x+y));
		// 평균 = 합계 / 계수
		System.out.println("x + y / 2 = " + (x+y/2));
		System.out.println("(x + y) / 2 = " + ((x+y)/2));
		//연산 우선순위에 맞게 ()를 사용한다
		//사칙 연산 우선순위 /,* -> +,-
	}
}
