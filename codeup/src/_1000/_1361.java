/*n이 입력되면 n층의 별 계단을 출력하시오.

예) n= 5인 경우,

**
 **
  **
   **
    **
    */

package _1000;

import java.util.Scanner;

public class _1361 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = 0; j < i; j++) {
				if(j == i-1)
					System.out.print("**");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
