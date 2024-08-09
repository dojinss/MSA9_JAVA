package _1000;

import java.util.Scanner;

public class _1503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int arr[][] = new int[input][input];
		boolean on = true;
		for (int i = 0; i < arr.length; i++) {
			if(on) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (j+1)+(i*input);
					System.out.print(arr[i][j] + " ");
				}
			}
			else {
				for (int j = arr[i].length-1; j >= 0 ; j--) {
					arr[i][j] = (j+1)+(i*input);
					System.out.print(arr[i][j] + " ");
				}
			}
			on = !on;
			System.out.println();
		}
		
		sc.close();

	}
}
