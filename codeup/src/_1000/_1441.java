package _1000;
/*
 * 오름차순 정렬 (버블 정렬)
 * */
import java.util.Scanner;

public class _1441 {
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