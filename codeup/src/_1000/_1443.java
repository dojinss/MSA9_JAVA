package _1000;

import java.util.Scanner;

/*
5
1
3
2
5
4

오름차순 정렬 및 중복숫자 제거

[ 삽입 정렬 방식 ]
*/
public class _1443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		int num = sc.nextInt();
		int a[] = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}
		sc.nextLine();
		// 오름차순 정렬 (삽입 정렬)
		// 2번째부터 바로 전단계와 비교하며 0번째까지 비교, 키값보다 큰수는 뒤로 밀어내고 자리를 찾아감
		for (int i = 1; i < a.length; i++) { 	// 2번째 부터시작	
			for (int j = i; j > 0; j--) {		// 앞에 배열요소들 만큼 index[1]까지 반복
				if(a[j] < a[j-1]) {				// 바로 전단계 인덱스와 크기 비교 하여 자리바꿈
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
				else break;						// 앞단계보다 클경우 반복 종료
			}
		}
		
		
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		sc.close();
	}
}
