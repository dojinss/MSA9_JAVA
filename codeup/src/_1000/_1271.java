package _1000;

import java.util.Scanner;

/*입력의 개수 n이 입력되고 n개의  데이터가 입력된다.

이 n개의 데이터 중 최댓값을 출력한다.
*/

public class _1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxNum = 0;
		for (int i = 1; i <= n; i++) {	
			int input = sc.nextInt();
			maxNum = (maxNum < input)?input:maxNum; 
		}
		System.out.println(maxNum);
		
		
		sc.close();
	}
}
