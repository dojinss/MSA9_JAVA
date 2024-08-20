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
		for (int i = 0; i < a.length; i++) {
			for(int j = (a.length-2); j >= i; j--){
				if(a[j] > a[j+1]) {					
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}				
			}
		}
		
		for (int i : a) {
			System.out.println(i);
		}
		
		
		
		sc.close();
	}
}
