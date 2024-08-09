package Day05.Ex02_Calculator;

/*
 * 	계산기
 * 	- 피연산자를 2개로 하는 계산기
 * 	- 기능
 * 		1. 덧셈		: 정수 2개를 덧셈
 * 		2. 뺄셈		: 정수 인자1 - 인자2 연산을 하는 뺄셈
 * 		3. 곱셈		: 실수 2개를 곱셈
 * 		4. 나눗셈		: 실수 인자1 / 인자2 연산을 하는 나눗셈
 * 		5. 나머지		: 실수 인자1 % 인자2 연산을 하는 나머지 연산
 * 		6. 합계 		: 배열로 매개변수를 전달 받아, 모든요소의 합을 구함
 * 		7. 평균 		: 배열로 매개변수를 전달 받아, 모든요소의 평균을 구함
 * 
 * 		* 메소드명
 * 			: plus, minus, multiple, divide, remain, sum, avg
*/
public class Calculator {
	

	//	1. 덧셈		: 정수 2개를 덧셈
	public int plus(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	//	2. 뺄셈		: 정수 인자1 - 인자2 연산을 하는 뺄셈
	public int minus(int num1,int num2) {
		int sum = num1 - num2;
		return sum;
	}
	
	//	 3. 곱셈		: 실수 2개를 곱셈
	public double multiple(double num1,double num2) {
		double multi = num1 * num2;
		return multi;
	}
	
	//	4. 나눗셈		: 실수 인자1 / 인자2 연산을 하는 나눗셈
	public double divide(double num1,double num2) {
		double divi = num1 / num2;
		return divi;
	}
	
	//	5. 나머지		: 실수 인자1 % 인자2 연산을 하는 나머지 연산
	public double remain(double num1,double num2) {
		double re = num1 % num2;
		return re;
	}
	
	//	6. 합계 		: 배열로 매개변수를 전달 받아, 모든요소의 합을 구함
	public int sum(int numbers[]) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}
	
	//	7. 평균 		: 배열로 매개변수를 전달 받아, 모든요소의 평균을 구함
	public double avg(int numbers[]) {
		return (double)sum(numbers)/numbers.length;
	}
}
