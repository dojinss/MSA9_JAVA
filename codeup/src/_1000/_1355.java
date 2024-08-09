/*길이 n이 입력되면 다음과 같은 역삼각형을 출력한다.

예)

n이 5이면

*****
 ****
  ***
   **
    **/

package _1000;

import java.util.Scanner;

public class _1355 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = input; i >= 1; i--) {
			for (int j = 0; j < input - i; j++) {				
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();

	}
}
