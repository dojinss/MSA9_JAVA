/*
 * int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
*/
package _1000;

import java.util.Scanner;

public class _1017 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.printf("%d %d %d",input,input,input);
		
		sc.close();
	}
}
