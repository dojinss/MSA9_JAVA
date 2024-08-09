package Day03;

import java.util.Scanner;

public class Ex15_Continue {
	public static void main(String[] args) {
		//5개의 정수를 입력받아 양수만 합계를 구하여 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
				
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if(n<0)
				continue;
			// while : 조건식으로 돌아간다.
			// for : 증감식으로 돌아간다.
			
			sum += n;
		}
		System.out.println("양수의 합은 : " + sum);

		sc.close();

	}
}
