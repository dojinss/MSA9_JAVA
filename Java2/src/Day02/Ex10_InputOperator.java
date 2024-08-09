package Day02;

import java.util.Scanner;

public class Ex10_InputOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
		
		// 합계 평균
		int sum = x + y + z;
		double avg = sum / 3;
		// *int 는 정수 자료형으로, 연산을 하면 결과도 int 자료형이 된다.
		// *int 정수 자료형으로는 실수의 소수부분을 표현할 수 없다.
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);		
		
		// 큰자료형 + 작은 자료형 = 큰자료형
		// 서로다른 자료형 연산시, 결과는 큰 자료형으로 변환 된다.
		
		double realAvg1 = (double)sum / 3;
		double realAvg2 = sum / 3.0;
		
		System.out.println("실제 평균1 : " + realAvg1);
		System.out.println("실제 평균2 : " + realAvg2);		
		
		sc.close();

	}
}
