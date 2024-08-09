package _1000;

import java.util.Scanner;

public class _1504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int arr[][] = new int[input][input];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if((j+1)%2==1)
					arr[i][j] = (i+1)+(j*input);
				else
					arr[i][j] = ( (input * (j+1) + input * j) - ((input * j) + (i)) );
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
