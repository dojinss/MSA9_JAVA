/*어떤 수 n을 입력받으면 다음과 같은 삼각형을 출력한다.

여기서 입력되는 n은 반드시 홀수이다.*/

package _1000;

import java.util.Scanner;

public class _1358 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int line = input/2 + 1;
		int spaceCount = input/2;
		for (int i = line; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				if(j<=spaceCount)
					System.out.print(" ");
				else
					System.out.print("*");
				
			}
			System.out.println();
			spaceCount--;
		}
		
		sc.close();

	}
}
