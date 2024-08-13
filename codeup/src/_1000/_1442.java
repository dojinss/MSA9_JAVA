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

[ 선택 정렬 방식 ] 
*/
public class _1442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 0;
		int temp = 0;
		int num = sc.nextInt();
		int a[] = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = (i+1); j < a.length; j++) {
				if(a[min] > a[j] ) {
					min = j;
					temp = a[min];
				}
				else if(a[min] == a[j])
					continue;
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
		for (int i : a) {
			System.out.println(i);
		}
		
		
		
		sc.close();
	}
}
