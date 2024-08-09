/*n이 입력되면 다음 삼각형을 출력하시오.

예) n = 4

*
**
***
****
***
**
*


*/

package _1000;

import java.util.Scanner;

public class _1357 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for (int i = 1; i < input; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = input; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
