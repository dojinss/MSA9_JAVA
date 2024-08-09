package Day03;

import java.util.Scanner;

public class Ex16_Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 무한루프
		// 반복문은 반드시 종료조건을 추가해주어야한다.
		while(true) {
			System.out.print("입력 : ");
			String input = sc.nextLine();
			
			// String 타입은 참조 자료형
			// 문자열 같은경우는 .equals("비교문자열") 만 비교할수있다.
			if(input.equals("STOP"))
				break;
			System.err.println(">> " + input);
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();

	}
}
