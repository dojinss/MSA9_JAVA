package _1000;

import java.util.Scanner;

public class _1501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int arr[][] = new int[input][input];
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}
}
