package Day03;

public class Ex12_For {
	public static void main(String[] args) {
		// for(초기식 ; 조건식 ; 증감식){}
		// -실행순서 1->반복
		for (int a = 1; a <= 10; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		// 2. 1~100 까지 정수를 출력하시오.
		for (int i = 50; i <= 100; i++) {
			System.out.print(i + " ");
			if(i>50 && i%10 == 0)
				System.out.println();
		}
		System.out.println();
		System.out.println("-----------------");
		// 3. 1~20 까지 정수 중 짝수만 출력하시오.
		for (int j = 1; j <= 20; j++) {
			if(j%2 == 0)
				System.out.print(j + " ");
		}
		System.out.println();
		System.out.println("-----------------");
		
		// 4. 1~20 까지 정수 중 홀수만 출력하시오.
		for (int k = 1; k <= 20; k++) {
			if(k%2 == 1)
				System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("-----------------");
	}
}
