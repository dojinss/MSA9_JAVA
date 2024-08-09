package _1000;



/*어떤 두 수 a, b가 있을 때 두 수 사이의 모든 정수를 오름차순으로 출력하시오.

예를 들어, a=5 , b=10일 경우 5 6 7 8 9 10입니다.*/
import java.util.Scanner;

public class _1253 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int start = 0;
		int end = 0;
		start = (a<b)?a:b;
		end = (a>b)?a:b;
		
		// 두수 치환법 임시저장소이용법
		if(a>b) {
			int temp = 0;
			temp = a;
			a = b;
			b = temp;
		}
//		System.out.println("a >> " + a);
//		System.out.println("b >> " + b);
		
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}
}
