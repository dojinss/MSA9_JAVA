package Day03;

import java.util.Scanner;

public class Ex02_IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 :");
		int num = sc.nextInt();
		
		if ((num % 2) == 0)	
			System.out.println(num + "은 짝수입니다.");
		else
			System.out.println(num + "은 홀수입니다.");
		
		sc.close();

	}
}
