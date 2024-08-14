package Day07.Review;

import java.util.Iterator;
import java.util.Scanner;

public class Ex05_Matrix {
	public static void main(String[] args) {
		// 양의 정수 M과 N을 입력 받아 지정하고,
		// M행 N열의 2차원 배열을 생성한다.
		// 각 요소의 값을 입력받고, 그대로 출력하시오.
		// 입력 예시
		// M : 2
		// N : 3
		// 1 2 3
		// 4 5 6
		
		Scanner sc = new Scanner(System.in);
		System.out.print("M : ");
		int input1 = sc.nextInt();
		System.out.print("N : ");
		int input2 = sc.nextInt();
		int[][] arr = new int[input1][input2];
		int count = 1;
				
		System.out.println("::::값을 입력하세요.::::");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(count++ + "번쨰 숫자 입력 : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("::::결과 값::::");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("========================");
		// foreach 2차원 배열출력
		for (int[] row : arr) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
