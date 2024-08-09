/*길이 n이 입력되면 다음과 같은 사각형을 출력한다.

예)

n이 5일때

*****
*   *
*   *
*   *
******/

package _1000;

import java.util.Scanner;

public class _1356 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = 0; j < input; j++) {
				if(i == 1 || i == input)
					System.out.print("*");
				else if(j > 0 && j < input-1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
				
			System.out.println();
		}
		
		sc.close();

	}
}
