package Day05.Ex02_Calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator ca = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a : ");
		int a = sc.nextInt();
		System.out.println("b : ");
		int b = sc.nextInt();
		
		System.out.println("1. 덧셈 : " + ca.plus(a, b));
		System.out.println("2. 뺄셈 : " + ca.minus(a, b));
		
		System.out.println("x : ");
		double x = sc.nextDouble();
		System.out.println("y : ");
		double y = sc.nextDouble();
	
		// printf("포멧",변수) : %X.Y(리터럴)
		// - X : 양수 - 크기만큼 칸을 지정하고 오른쪽으로 정렬
		//	   	 음수 - 크기만큼 칸을 지종하고 왼쪽으로 정렬
		// - Y : 지정한 크기만큼 소수점 아래 자리수를 표현(반올림)
		// * (리터럴) : %d (정수), %f(실수). $s(문자열)
		System.out.printf("3. x * y = %.2f \n" ,ca.multiple(x, y));
		System.out.printf("4. x / y = %.2f \n",ca.divide(x, y));
		System.out.println("5. x % y = " + ca.remain(x, y));
			
		int numbers[] = {10,20,30,30,30};
		System.out.println("6. 합계 : " + ca.sum(numbers));
		System.out.println("7. 평균 : " + ca.avg(numbers));
		
		sc.close();
	}
}
