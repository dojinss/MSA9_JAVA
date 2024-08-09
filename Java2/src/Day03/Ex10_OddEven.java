package Day03;

public class Ex10_OddEven {
	public static void main(String[] args) {
		// 1부터 20까지 정수 중,
		// 홀수의 합계, 짝수의 합계를 각각 구하시오.
		
		int i = 1;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		while(i<=20) {
			if(i%2 == 0)
				sum1 += i;
			else
				sum2 += i;
			sum3 += i++;
		}
		System.out.println("홀수의 합계 : " + sum2);
		System.out.println("짝수의 합계 : " + sum1);
		System.out.println("총 합계 : " + sum3);
	}
}
