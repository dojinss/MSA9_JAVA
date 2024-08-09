package Day03;

import java.util.Scanner;

public class Ex13_Gugu {
	public static void main(String[] args) {
		// 구구단 (1~9)
		//원하는 단을 입력받아 아래와 같이 구구단 수식을 출력하시오.
		// 4*1=4
		// 4*2=8
		// 4*3=12
		// 4*4=16
		System.out.println("구구단 출력 시스템");
		System.out.print("원하는 단을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
			

		for (int i = 1; i < 10; i++) {
			if(num < 1 || num > 9) {
				System.out.println("1~9사이 숫자만 입력해주세요.");
				break;
			}
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		
		sc.close();
	}
}
