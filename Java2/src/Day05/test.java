package Day05;

import Day05.Ex02_Calculator.Calculator;

public class test {
	public static void main(String[] args) {
		Calculator ca = new Calculator();
		System.out.println("1. 덧셈 : " + ca.plus(40, 2));
		System.out.println("2. 뺄셈 : " + ca.minus(40, 2));
		System.out.println("3. 곱셈 : " + ca.multiple(40, 2));
		System.out.println("4. 나눗셈 : " + ca.divide(40, 2));
		System.out.printf("5. 나머지 : %.2f",ca.remain(40, 1.2));
		System.out.println();
		int numbers[] = {10,20,30,30,30};
		System.out.println("6. 합계 : " + ca.sum(numbers));
		System.out.println("7. 평균 : " + ca.avg(numbers));
	}
}
