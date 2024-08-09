/*n이 입력되면 다음과 같은 삼각형을 출력하시오.

예)

n 이 5 이면

*
**
***
****
******/
package _1000;

import java.util.Scanner;

public class _1353 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = 0; j < i; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();

	}
}
