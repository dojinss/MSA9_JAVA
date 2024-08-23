package Day10_13.Ex02_Util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class ArraysEx {
	
	public static void main(String[] args) {
		
		Integer[] arr = {5,3,4,1,2};
		
		// 배열 정렬 (sort) - 오름차순
		Arrays.sort(arr);
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 배열 정렬 (sort) - 내림차순
		Arrays.sort(arr,Collections.reverseOrder());
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 이진 탐색 알고리즘 (BinarySearch)
		// Arrays.binarySearch(배열, 찾을값)
		// - 전제 조건  : 주어진 배열이 오름차순 정렬되어 있어야한다.
		// - 이진 탐색 알고리즘을 사용하여 탐색한 후,
		// 1. 해당 값이 있으면, 그 위치(index)를 반환
		// 2. 해당 값이 없으면, () - (insertion point - 1) 음수를 반환
		// * insertion point
		// : 해당 값이 배열에 있다고 가정했을 때, 정렬에 따라 삽입 되어야 할 위치
		
		// 1 ~ 100 사이의 랜덤 정수 수열을 만들고,
		// 이 중에서 정수 10을 이진 탐색 알고리즘으로 탐색해보시오.
		int[] rnd = new int[100];
		Random random = new Random();
		for (int i = 0; i < rnd.length; i++) {
			rnd[i] = random.nextInt(100) + 1;
		}
		
		// 오름 차순 정렬
		
		Arrays.sort(rnd);
		int count = 1;
		for (int i : rnd) {
			if(i < 10) System.out.print("  ");
			else if(i < 100) System.out.print(" ");
			System.out.print(i + " ");
			if(count++ % 10 == 0) System.out.println();
		}
		System.out.println();
		
		// 이진 탐색
		// : 정수 10을 100개의 난수중에서 탐색
		int result = Arrays.binarySearch(rnd, 10);
		if(result < 0) {
			System.out.println("랜덤 수 10이 없습니다.");
			System.out.println("insertion point : " + result);
		}
		else {
			System.out.println("랜덤 수 10의 위치(index) : " + result);
		}
		
		// Arrays.fill(값)
		// : 값으로 모든 배열요소를 채우는 메소드
		int fill[] = new int[10];
		
		Arrays.fill(fill, 8);
		
		for (int i : fill) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// Arrays.copyOf(배열, 길이)
		// : 배열을 앞에서 부터 (길이)개의 요소를 복사하여 새 배열로 반환
		int copy[] = Arrays.copyOf(fill, 3);
		// 8 8 8 8 8  8 8 8 8 8
		// 8 8 8 을 복사하여 반환
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// Arrays.copyOfRange(배열, 시작index, 끝index +1)
		// : 배열을 시작index ~ 끝index 까지의 요소를 복사하여 새 배열로 반환
		int copyRange[] = Arrays.copyOfRange(rnd, 10, 20);
		
		for (int i : copyRange) {
			System.out.print( i + " " );
		}
		System.out.println();
	}
}
