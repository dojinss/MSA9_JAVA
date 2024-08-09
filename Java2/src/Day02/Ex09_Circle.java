package Day02;

import java.util.Scanner;

public class Ex09_Circle {
	public static void main(String[] args) {
		// 상수
		// - 프로그램 실행 동안 값을 변경하지 않고 사용할 값을 지정할때 상수로 지정함
		// * 상수 선언시, 반드시 값을 초기화 해야한다.
		// * 선언 후에 값을 변경하면 에러가 발생한다.
		// - 키워드 : final
		final double PI = 3.141592;
		Scanner sc = new Scanner(System.in);
		// 원의 넓이 PI*R^2
		System.out.print("반지름 : ");
		double radius = sc.nextDouble();
		// double area = PI * radius * radius;
		double area = PI * Math.pow(radius, 2);
		
		System.out.println("원의 넓이 : " + area);
		sc.close();

	}
}
