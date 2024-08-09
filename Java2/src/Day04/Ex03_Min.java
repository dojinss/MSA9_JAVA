package Day04;

import java.util.Scanner;

public class Ex03_Min {
	public static void main(String[] args) {
		// 첫 번째 줄에 입력할 개수 N을 입력받고,
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수 중, 최솟값을 구하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 개수를 정하시오 : ");
		int input = sc.nextInt();
		int arr[] = new int[input];
		int minNum = Integer.MAX_VALUE;
		
		System.out.println("[" + input + "]개의 정수를 입력하세요.");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(minNum > arr[i]) minNum = arr[i];
		}
		System.out.println("최솟값 : " + minNum);
		
		sc.close();
		
	}
}
